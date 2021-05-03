package com.example.demo.repository;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Devices;

@Repository
public interface DevicesRepository extends MongoRepository<Devices ,String> {
	Optional<Devices> findByTitle(String title);

	@Query("{'$or':[ {'title': {$regex : ?0, $options: 'i'}}, {'price': {$regex : ?0, $options: 'i'}}, "
			+ "{'description': {$regex : ?0, $options: 'i'}},{'avatarUrl': {$regex : ?0, $options: 'i'}}, {'imageUrl01': {$regex : ?0, $options: 'i'}}, {'imageUrl02': {$regex : ?0, $options: 'i'}},"
			+ " {'imageUrl03': {$regex : ?0, $options: 'i'}}, {'imageUrl04': {$regex : ?0, $options: 'i'}},{'leDescrip01': {$regex : ?0, $options: 'i'}}{'leDescrip02': {$regex : ?0, $options: 'i'}}"
			+ "{'leDescrip03': {$regex : ?0, $options: 'i'}},{'riDescrip04': {$regex : ?0, $options: 'i'}}]}")
	Page<Devices> searchDevices(Pageable pageable, String searchText);

}
