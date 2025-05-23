package com.shopme.common;

public class Constants {
	/*This class is required for Amazon AWS intregation, for images and logos*/
	
	public static final String S3_BASE_URI;
	
	static {
		String bucketName = System.getenv("AWS_BUCKET_NAME"); /*Declared variables name in local system environment*/
		String region = System.getenv("AWS_REGION"); /*Declared variables name in local system environment*/
		String pattern = "https://%s.s3.%s.amazonaws.com";
		
		S3_BASE_URI = bucketName == null ? "" : String.format(pattern, bucketName, region);
	}
	
}
