package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		
		repo.delete(a);
		
		return "deleted";
	}
	
	@PutMapping(path = "/alien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
	}
	/*
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		//saves the submitted info to the database table
		repo.save(alien);
		return "home.jsp";
		
	}
	*/
	
	@PostMapping(path="/alien")
	//consumes specifies the data type that can be taken in by the post method
	public Alien addAlien(@RequestBody Alien alien) {
		
		//saves the submitted info to the database table
		repo.save(alien);
		return alien;
		
	}
	
/*
	//@RequestParam fetches the value from the client
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		//saves the submitted info to the database table
		Alien alien = repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByAidGreaterThan(101));
		System.out.println(repo.findByTechSorted("Java")); 
		mv.addObject(alien);
		return mv;
		}
*/
	@GetMapping(path="/aliens")
	//produces= {"application/xml"} : "produces" keyword allows it to only show data in a certain format
	//@ResponseBody is used to notify the dispatcher servlet that you are returning actual data instead of view name
	@ResponseBody
	public List<Alien> getAliens() {
		
		return repo.findAll();
	}
	
	//used to get a single data entry
	@RequestMapping("/aliens/{aid}")
	//@ResponseBody is used to notify the dispatcher servlet that you are returning actual data instead of view name
	@ResponseBody
	//@PathVariable is used to make sure that the aid parameter in the path {aid} gets assigned to the aid in the method
	//Optional returns optional data if there is no data to be presented 
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		
		return repo.findById(aid);
	}
}
