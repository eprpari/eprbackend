package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.work;
import com.example.demo.services.workServices;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/admin")
public class workControllers {
	
	@Autowired
	workServices workservices;

	@PostMapping
	public ResponseEntity<work> creatework(@RequestBody work data) {
		return  workservices.creatework(data); 
	}
	
	@GetMapping
	public ResponseEntity<List<work>> getallwork () {
		return workservices.getallwork();
	}
	
	@GetMapping(params = "id")
	public ResponseEntity<work> getworkbyidparams (@RequestParam String id) {
		return workservices.getworkbyidparams(id);
	}
	
	@GetMapping(params = "title")
	public ResponseEntity<List<work>> getWorkByTitle (@RequestParam String title) {
		return workservices.getWorkByTitle(title);
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<work> getworkbyid (@PathVariable String id) {
		return workservices.getworkbyid(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<work>  updatework (@PathVariable String id,@RequestBody work workers) {
		return workservices.updatework(id, workers );
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deletework(@PathVariable("id") String id){
		return workservices.deletebook(id);
	} 
//	@GetMapping("/{search}")
//	public ResponseEntity<?> worksearch (@PathVariable String search ,
//			@RequestParam(value = "pageNo",defaultValue = "0") int pageNo,
//			@RequestParam(value="pageSize" ,defaultValue = "0") int pageSize ,
//			@RequestParam(name = "sortBy" , defaultValue = "id") String sortBy)
//{
//			
//	return workservices.getworksearch(search,pageNo,pageSize,sortBy);
//}

	

}