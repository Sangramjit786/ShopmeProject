package com.shopme.admin.brand;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.shopme.admin.paging.SearchRepository;
import com.shopme.common.entity.Brand;

public interface BrandRepository extends SearchRepository<Brand, Integer> {

	public Brand save(Brand acer);

//	public Iterable<Brand> findAll();

	public Optional<Brand> findById(int i);

	public void deleteById(Integer id);

	public Long countById(Integer id);
	
	public Brand findByName(String name);
	
	@Query("SELECT b FROM Brand b WHERE b.name LIKE %?1%")
	public Page<Brand> findAll(String keyword, Pageable pageable);
	
	@Query("SELECT NEW Brand(b.id, b.name) FROM Brand b ORDER BY b.name ASC")
	public List<Brand> findAll();

}
