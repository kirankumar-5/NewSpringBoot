package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GradDao;
import com.example.demo.model.Tech;

@Service
public class GradService {
	
	@Autowired GradDao gradDao;
	
	public Optional<Tech> getTech(String id)
	{
		return gradDao.findById(id);
	}
}