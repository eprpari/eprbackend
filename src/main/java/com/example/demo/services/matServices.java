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

import com.example.demo.model.Mat;
import com.example.demo.repository.matRepository;


@Service
public class matServices {

	
	@Autowired
	matRepository matrepository;
	
	public ResponseEntity<Mat> createMat(Mat data) {
		try {
			Mat mm =matrepository.save(data);
			return new ResponseEntity<>(mm,HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	public ResponseEntity<List<Mat>> getAllMat () {
		try {
		List<Mat> mats = new ArrayList<>();
		
		matrepository.findAll().forEach(mats::add) ;
		
		if (mats.isEmpty()) {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(mats,HttpStatus.OK);
		}
		}catch (Exception e) {
			return new ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<Mat> getMatById (String id){
		Optional<Mat> mats =  matrepository.findById(id);
		
		if(mats.isPresent()) {
			return new  ResponseEntity<>(mats.get(), HttpStatus.OK);
			
		}else {
			return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<Mat> getMatByIdParams(String id){
		Optional<Mat> matparam = matrepository.findById(id);
		if (matparam.isPresent()) {
			return new ResponseEntity<>(matparam.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Mat>  updateMat (@PathVariable String id, @RequestBody Mat mats) {
		Optional<Mat> up =  matrepository.findById(id);
		
		if (up.isPresent()) {
			Mat _mats = up.get();
			_mats.setMatName(mats.getMatName());
			_mats.setMatType(mats.getMatType());
			_mats.setNumber(mats.getNumber());
			_mats.setData(mats.getData());
			_mats.setPrice(mats.getPrice());
			_mats.setMatImg(mats.getMatImg());
					
			Mat updateMat = matrepository.save(_mats);
			return new  ResponseEntity<>(updateMat, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
	
	public ResponseEntity<HttpStatus> deleteMat (String id){
		try {
			Optional<Mat> up =  matrepository.findById(id);
			if(up.isPresent()) {
				matrepository.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
