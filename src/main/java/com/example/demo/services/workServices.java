package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.work;
import com.example.demo.repository.workRepository;

@Service
public class workServices {

	
	@Autowired
	workRepository workrepository;
	 
	public ResponseEntity<work> creatework(work data) {
		try {
			work ww =workrepository.save(data);
			return new ResponseEntity<>(ww,HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	public ResponseEntity<List<work>> getallwork () {
		try {
		List<work> workers = new ArrayList<>();
		
		workrepository.findAll().forEach(workers::add) ;
		
		if (workers.isEmpty()) {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(workers,HttpStatus.OK);
		}
		}catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	public ResponseEntity<work> getworkbyid (String id){
		Optional<work> workers =  workrepository.findById(id);
		
		if(workers.isPresent()) {
			return new  ResponseEntity<>(workers.get(), HttpStatus.OK);
			
		}else {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<work> getworkbyidparams(String id){
		Optional<work> workparam = workrepository.findById(id);
		if (workparam.isPresent()) {
			return new ResponseEntity<>(workparam.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	 
	
	public ResponseEntity<work>  updatework (@PathVariable String id, @RequestBody work workers) {
		Optional<work> up =  workrepository.findById(id);
		
		if (up.isPresent()) {
			work _workers = up.get();
			_workers.setTitle(workers.getTitle());
			_workers.setData(workers.getData());
			_workers.setAddress(workers.getAddress());
			_workers.setAge(workers.getAge());
			_workers.setImg(workers.getImg());
			_workers.setName(workers.getName());
			_workers.setNumber(workers.getNumber());
			_workers.setCity(workers.getCity());
			_workers.setSalary(workers.getSalary());
			
			work updatework = workrepository.save(_workers);
			return new  ResponseEntity<>(updatework, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
	
	public ResponseEntity<HttpStatus> deletebook (String id){
		try {
			Optional<work> up =  workrepository.findById(id);
			if(up.isPresent()) {
				workrepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	public ResponseEntity<List<work>> getWorkByTitle(String title) {
		try {
			List<work> workers = workrepository.findByTitle(title);
			
			
			if (workers.isEmpty()) {
				return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(workers,HttpStatus.OK);
			}
			}catch (Exception e) {
				return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
			}
	
	}
	
//	
//	public ResponseEntity<Page<work>> getworksearch(String searchText , int pageNo , int pageSize , String sortBy) {
//		try {
//			Pageable pageable = (Pageable) PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//			Page<work> workPage = workrepository.searchWork(pageable,".*" + searchText + ".*");
//			if (workPage.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//				
//			}
//			return new ResponseEntity<>(workPage , HttpStatus.OK);
//		}catch (Exception e) {
//				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//	
//	}
}
