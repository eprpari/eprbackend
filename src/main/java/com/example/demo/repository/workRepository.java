package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.work;



@Repository
public interface workRepository extends MongoRepository<work, String>{
// List<work> findByTitleContaining(String title);
//	
//	@Query("{'$or' : [{'title' : {$regex : ?0 , $options : 'i'}},{'author' : {$regex : ?0, $options : 'i'}},"
//			+ "{'language' : {$regex : ?0, $options : 'i'}},{'genre' : {$regex : ?0, $option : 'i'}}]}")
//	Page<work> searchWork(Pageable pageable, String searchText);
//		

	List<work> findByTitle(String title);
	
	
}

