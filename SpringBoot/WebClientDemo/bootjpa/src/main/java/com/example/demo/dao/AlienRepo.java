package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

//original code used CrudRepository 
public interface AlienRepo extends JpaRepository<Alien,Integer> {

/*
	//methods have to start with findBy followed by the parameter you want to look for
	List<Alien> findByTech(String tech);
	
	//to find values greater or less than a certain value you  need to put GreaterThan or LessThan
	List<Alien> findByAidGreaterThan(int aid);
	
	//user defined complex queries need the @Query tag to tell the method what to do
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	*/
	

}
