package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Company;
import com.example.demo.model.Project;
import com.example.demo.model.work;
import com.example.demo.repository.companyRepository;
import com.example.demo.repository.workRepository;

@Service

public class companyServices {
	
	
	@Autowired
	companyRepository companyrepository;
	
	public ResponseEntity<Company> createCompany(Company data) {
		try {
			Company com =companyrepository.save(data);
			return new ResponseEntity<>(com,HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<Company>> getAllCompany () {
		try {
		List<Company> companys = new ArrayList<>();
		
		companyrepository.findAll().forEach(companys::add) ;
		
		if (companys.isEmpty()) {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(companys,HttpStatus.OK);
		}
		}catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<Company> getCompanyById (String id){
		Optional<Company> companys =  companyrepository.findById(id);
		
		if(companys.isPresent()) {
			return new  ResponseEntity<>(companys.get(), HttpStatus.OK);
			
		}else {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<Company> getCompanyByIdParams(String id){
		Optional<Company> companyparam = companyrepository.findById(id);
		if (companyparam.isPresent()) {
			return new ResponseEntity<>(companyparam.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
//	public ResponseEntity<Company>  updateCompany (@PathVariable String id, @RequestBody Company companys) {
//		Optional<Company> up =  companyrepository.findById(id);
//		
//		if (up.isPresent()) {
//			work _com = up.get();
//			_com.setName(companys.getName());
//			_com.setLogo(companys.getLogo());
//			_com.setWeAre(companys.getWeAre());
//			_com.setPhotos(companys.getPhotos());
//			_com.setId(companys.getId());
//			_com.setTeam(companys.getTeam());
//			_com.setTphotos(companys.getTphotos());
//			_com.setNumber(companys.getNumber());
//			
//			work updatework = workrepository.save(_workers);
//			return new  ResponseEntity<>(updatework, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		}
	
	public ResponseEntity<HttpStatus> deleteCompany (String id){
		try {
			Optional<Company> up =  companyrepository.findById(id);
			if(up.isPresent()) {
				companyrepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	public ResponseEntity<Company> getCompanyByName(String comapanyName) {
		try {
			Company companys = companyrepository.findByCompanyName(comapanyName);
			
			
//			if (companys. {
//				return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			
//			else {
				return new ResponseEntity<>(companys,HttpStatus.OK);
//			}
			}catch (Exception e) {
				return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
			}
	
	}

	public ResponseEntity<Company> createProject(String name, Project project) {
		try {
			System.out.println("Hai");
			 Company companys = companyrepository.findByCompanyName(name);
				System.out.println(companys.getCompanyName());
			List<Project> projects = companys.getProjects() ;
			projects.add(project);
			System.out.println(projects.toArray());
			companys.setProjects(projects);
				Company save = companyrepository.save(companys);
			
				System.out.println(save.getProjects());
				return new ResponseEntity<>(save,HttpStatus.OK);
			}catch (Exception e) {
				return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
			}

	}
	
	
	public ResponseEntity<List<String>> getAllCompanyName () {
		try {
		List<String> companyNames = new ArrayList<>();
		List<Company> companys = new ArrayList<>();
		
		companyrepository.findAll().forEach(companys::add) ;
		for (Company company : companys) {
			companyNames.add(company.getCompanyName());
		}
		if (companyNames.isEmpty()) {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(companyNames,HttpStatus.OK);
		}
		}catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	

	
	
	
	
	
}
