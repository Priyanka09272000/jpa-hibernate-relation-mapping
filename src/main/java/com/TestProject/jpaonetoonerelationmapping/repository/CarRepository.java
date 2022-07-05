package com.TestProject.jpaonetoonerelationmapping.repository;



import com.TestProject.jpaonetoonerelation.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car,Long> {
}

