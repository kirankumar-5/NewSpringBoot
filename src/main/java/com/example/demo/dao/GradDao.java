package com.example.demo.dao;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tech;

@Repository
public interface GradDao extends CrudRepository<Tech,Id> 
{

	Tech findById(String id);
}
