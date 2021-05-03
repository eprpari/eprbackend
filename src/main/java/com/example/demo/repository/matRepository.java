package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mat;


@Repository
public interface matRepository extends  MongoRepository<Mat, String> {

}
