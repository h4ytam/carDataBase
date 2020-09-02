package com.h4ytam.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.h4ytam.cardatabase.domain.Car;
import com.h4ytam.cardatabase.domain.CarRepository;
import com.h4ytam.cardatabase.domain.Owner;
import com.h4ytam.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository orepository;
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args->{
//				Adding owners
			Owner owner1=new Owner("john","johnson");
			Owner owner2=new Owner("mary","robinson");
			orepository.save(owner1);
			orepository.save(owner2);
			Car car=(new Car("ford","Mustang","Red","ADF-1121",2017,59000,owner1));
			repository.save(car);
			car=(new Car("Nissan","Leaf","white","ADF-148421",2014,60000,owner2));
			repository.save(car);
			car=(new Car("Toyota","Prius","Silver","ADF-9491",2013,80000,owner1));
			repository.save(car);		
		};
	}
}
