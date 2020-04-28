package com.apress.springrecipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.apress.springrecipes.repo.MovieRepository;

@Controller
public class MovieController {

	@Autowired
	private MovieRepository movieRepo;
	
	@RequestMapping("/")
	public String index(final Model model) {
		// loads 1 and display 1, stream data , date driven mode. 
		IReactiveDataDriverContextVariable reactiveDataDrivenMode = 
				new ReactiveDataDriverContextVariable(movieRepo.findAll(), 1);
		
		model.addAttribute("movies", reactiveDataDrivenMode);
		// classic, wait repository loaded all and display it .
		// model.addAttrivute("movies", movieRepo.findAll());
		
		System.out.println("aa");
		return "index";
	}
}
