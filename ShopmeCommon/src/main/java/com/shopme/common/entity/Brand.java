package com.shopme.common.entity;

import java.util.HashSet;
import java.util.Set;

import com.shopme.common.Constants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "brands")
public class Brand extends IdBasedEntity {
	
	@Column(nullable = false, length = 45, unique = true)
	private String name;
	
	@Column(nullable = false, length = 128)
	private String logo;
	
	@ManyToMany
	@JoinTable(
			name = "brands_categories",
			joinColumns = @JoinColumn(name = "brand_id"),
			inverseJoinColumns = @JoinColumn(name = "category_id")
			)
	private Set<Category> categories = new HashSet<>();
	
	public Brand() {
		
	}
	
	public Brand(String name) {
		this.name = name;
		this.logo = "brand-logo.png";
	}
	
	public Brand(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", categories=" + categories + "]";
	}
	
	@Transient
	public String getLogoPath() {
		if (this.id == null) return "/images/image-thumbnail.png";
		
		//return "/brand-logos/" + this.id + "/" + this.logo;	//This is line required for image path from local machine
		
		return Constants.S3_BASE_URI + "/brand-logos/" + this.id + "/" + this.logo; //This line used to access images from Amazon AWS S3 bucket 'shopme-imagefiles'
	}
}
