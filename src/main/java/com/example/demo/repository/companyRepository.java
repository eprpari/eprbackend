package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;



@Repository
public interface companyRepository extends MongoRepository<Company, String> {
	Company findByCompanyName(String companyName);
}
