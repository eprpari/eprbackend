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

import com.example.demo.model.Mat;
import com.example.demo.services.matServices;




@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/admin/materials")
public class matController {
	
	@Autowired
	matServices matservices;
	
	@PostMapping
	public ResponseEntity<Mat> createMat(@RequestBody Mat data) {
		return  matservices.createMat(data); 
	}
	
	@GetMapping
	public ResponseEntity<List<Mat>> getAllMat () {
		return matservices.getAllMat();
	}
	@GetMapping(params = "id")
	public ResponseEntity<Mat> getMatByIdParams (@RequestParam String id) {
		return matservices.getMatByIdParams(id);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Mat> getMatById (@PathVariable String id) {
		return matservices.getMatById(id);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Mat>  updateMat(@PathVariable String id,@RequestBody Mat mats) {
		return matservices.updateMat(id, mats );
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteMat(@PathVariable("id") String id){
		return matservices.deleteMat(id);
	} 
	
	
	
	
	
	
	
	
	
	
}
