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

import com.example.demo.model.Company;
import com.example.demo.model.Project;
import com.example.demo.services.companyServices;





@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/admin/company")
public class companyControllers {
	
	@Autowired
	companyServices companyservices;
	
	@PostMapping
	public ResponseEntity<Company> createCompany(@RequestBody Company data) {
		return  companyservices.createCompany(data); 
	}
	
	@GetMapping
	public ResponseEntity<List<Company>> getAllCompany () {
		return companyservices.getAllCompany();
	}
	
	@GetMapping(params = "id")
	public ResponseEntity<Company> getCompanyByIdParams (@RequestParam String id) {
		return companyservices.getCompanyByIdParams(id);
	}
	
	@GetMapping(params = "companyName")
	public ResponseEntity<Company> getCompanyByName (@RequestParam String companyName) {
		return companyservices.getCompanyByName(companyName);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompanyById (@PathVariable String id) {
		return companyservices.getCompanyById(id);
	}
	
//	@PutMapping("/{id}")
//	public ResponseEntity<Company>  updateCompany (@PathVariable String id,@RequestBody Company companys) {
//		return companyservices.updateCompany(id, companys );
//	}
//	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteCompany(@PathVariable("id") String id){
		return companyservices.deleteCompany(id);
	} 
	
	
	@PostMapping("/project/{companyName}")
	public ResponseEntity<Company> createProject (@PathVariable("companyName") String name, @RequestBody Project project){
		System.out.print(project.getProjectDetails());
		System.out.print(project.getProjectPhotos());
		System.out.print(project.getProjectPlace());
		return companyservices.createProject(name,project);
	}
	
	@GetMapping("/allcompanynames")
	public ResponseEntity<List<String>> getAllCompanyName() {
		return companyservices.getAllCompanyName();
	}
	
	
	
	

}
