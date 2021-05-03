package com.example.demo.repository;



import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Peoplesaid;




@Repository
public interface PeoplesaidRepository extends MongoRepository< Peoplesaid, String>{
	Optional<Peoplesaid> findByCompanyname(String companyname); 
	@Query("{'$or':[ {'companyname': {$regex : ?0, $options: 'i'}}, {'peoplename1': {$regex : ?0, $options: 'i'}}, "
			+ "{'peopleimg1': {$regex : ?0, $options: 'i'}}, {'status1': {$regex : ?0, $options: 'i'}}]}")
	Page<Peoplesaid> searchPeoplesaid(Pageable pageable, String searchText);

}
