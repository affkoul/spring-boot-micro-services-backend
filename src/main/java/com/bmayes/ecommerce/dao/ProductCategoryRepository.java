package com.bmayes.ecommerce.dao;

import com.bmayes.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path ="product-category") //collectionresourceurl - json entry //path - reference path /product-category
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {


}
