package com.bmayes.ecommerce.dao;


import com.bmayes.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "countries", path="countries") //expose /countries endpoint
public interface CountryRepository extends JpaRepository<Country, Integer> { //Country is entity class, integer is primary key
}
