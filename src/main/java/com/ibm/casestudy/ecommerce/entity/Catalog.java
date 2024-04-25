package com.ibm.casestudy.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="catalog")
public class Catalog {

	@Id 
    @Column(name = "catalog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catalogId;
	
	@Column(name = "product_id")
	private Long ProductId;
	 

	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}

	public Long getProductId() {
		return ProductId;
	}

	public void setProductId(Long productId) {
		ProductId = productId;
	}
	
}
