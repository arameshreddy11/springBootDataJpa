package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.model.Product;
import com.app.repo.productRepository;

public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private productRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("a",3.4));
		System.out.println(p.getProId());
		repo.save(new Product("B",2.3));
		repo.save(new Product("B",2.3));
		
		
		
		
		

	}

}
