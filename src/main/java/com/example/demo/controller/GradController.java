//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dao.GradDao;
//import com.example.demo.model.Tech;
//
//@RestController
//@Component
//public class GradController {
//	
//	@Autowired 
//	private GradDao gradDao;
//	
//	@GetMapping(value="/{id}")
//	public Tech findByTech(@PathVariable String id)
//	{
//		return gradDao.findById(id);
//	}
//}
