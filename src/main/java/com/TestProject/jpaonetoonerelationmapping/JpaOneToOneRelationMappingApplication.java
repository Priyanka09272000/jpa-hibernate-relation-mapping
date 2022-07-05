package com.TestProject.jpaonetoonerelationmapping;

import com.TestProject.jpaonetoonerelationmapping.repository.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaOneToOneRelationMappingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(JpaOneToOneRelationMappingApplication.class, args);
		CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
		repository.OwnerRepository ownerRepository = configurableApplicationContext.getBean(repository.OwnerRepository.class);
		Car car = new Car(model: "m200");
		carRepository.save(car);
		Owner owner = new Owner(name: "John Doe");
		owner.setCar(car);
		ownerRepository.save(owner);
	}

}
