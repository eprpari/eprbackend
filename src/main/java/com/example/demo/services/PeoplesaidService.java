package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Peoplesaid;
import com.example.demo.repository.PeoplesaidRepository;




@Service
public class PeoplesaidService {
	
	@Autowired
	PeoplesaidRepository peoplesaidRepository;
	
   
	public ResponseEntity<Peoplesaid> createPeoplesaid ( Peoplesaid peoplesaid) {
		try {
			Peoplesaid ff=peoplesaidRepository.save(peoplesaid);
		       return new ResponseEntity<>(ff, HttpStatus.CREATED);
		       } catch (Exception e) {
		    	   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    	   }
	}
	
	public ResponseEntity<List<Peoplesaid>> getAllPeoplesaid() {
		try {

		List<Peoplesaid>peoplesaid= new ArrayList<>();
	  peoplesaidRepository.findAll().forEach(peoplesaid::add);
	  
		if (peoplesaid.isEmpty()) { 
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else { return new ResponseEntity<>(peoplesaid,HttpStatus.OK);
			
		}

		}catch (Exception e) { 
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<Map<String, Object>> getAllPeoplesaidInPage(int pageNo, int pageSize, String sortBy) {
		try {
			Map<String, Object> response = new HashMap<>();
		    Sort sort = Sort.by(sortBy);
			Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		    Page<Peoplesaid> page = peoplesaidRepository.findAll(pageable);
		    response.put("data", page.getContent());
		    response.put("Total no of pages", page.getTotalPages());
		    response.put("Total no of elements", page.getTotalElements());
		    response.put("Current page no", page.getNumber());

		    return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<Peoplesaid> getPeoplesaidById(String id)
	 { Optional<Peoplesaid> ff = peoplesaidRepository.findById(id); 
	if (ff.isPresent())
	 { return new ResponseEntity<>(ff.get(), HttpStatus.OK);
	 } 
	else 
	 { return new ResponseEntity<>(HttpStatus.NOT_FOUND); } 
	 } 
	
	public ResponseEntity<Peoplesaid>updatePeoplesaid
	(@PathVariable  String id,@RequestBody Peoplesaid peoplesaid){
		Optional<Peoplesaid> p=peoplesaidRepository.findById(id);
		if(p.isPresent()) {
			Peoplesaid _peoplesaid=p.get();
			_peoplesaid.setCompanyname(peoplesaid.getCompanyname());
			_peoplesaid.setDescription1(peoplesaid.getDescription1());
			_peoplesaid.setDescription2(peoplesaid.getDescription2());
			_peoplesaid.setDescription3(peoplesaid.getDescription3());
			_peoplesaid.setStatus1(peoplesaid.getStatus1());
			_peoplesaid.setStatus2(peoplesaid.getStatus2());
			_peoplesaid.setStatus3(peoplesaid.getStatus3());
			_peoplesaid.setPeopleimg1(peoplesaid.getPeopleimg1());
			_peoplesaid.setPeopleimg2(peoplesaid.getPeopleimg2());
			_peoplesaid.setPeopleimg3(peoplesaid.getPeopleimg3());
			_peoplesaid.setPeoplename1(peoplesaid.getPeoplename1());
			_peoplesaid.setPeoplename2(peoplesaid.getPeoplename2());
			_peoplesaid.setPeoplename3(peoplesaid.getPeoplename3());
			_peoplesaid.setCompanyimg(peoplesaid.getCompanyimg());
			
			Peoplesaid updatedPeoplesaid=peoplesaidRepository.save(_peoplesaid);
			return new ResponseEntity<>(updatedPeoplesaid,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<HttpStatus> deletePeoplesaid(@PathVariable String id){
		try {
			Optional<Peoplesaid> p=peoplesaidRepository.findById(id);
			if(p.isPresent()) {
				peoplesaidRepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<Page<Peoplesaid>> getPeoplesaidBySearch(String searchText, int pageNo, int pageSize, String sortBy) {
	    try {
//	      

	    	Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
	    	Page<Peoplesaid> peoplesaidPages = peoplesaidRepository.searchPeoplesaid(pageable, ".*" + searchText + ".*");
	    if (peoplesaidPages.isEmpty()) {
	             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	        return new ResponseEntity<>(peoplesaidPages, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	public ResponseEntity<Peoplesaid> getCompanyname(String companyname) {
		Optional<Peoplesaid>peoplesaid=peoplesaidRepository.findByCompanyname(companyname);
		
		if (peoplesaid.isPresent()) {
			return new ResponseEntity<>(peoplesaid.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}
	  }



}
