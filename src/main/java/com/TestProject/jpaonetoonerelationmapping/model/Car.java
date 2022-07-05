package com.TestProject.jpaonetoonerelation.model;
import javax.persistence.*;


@Entity
@Table(name="Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    @OneToOne(mappedBy = "car")

    private Owner owner;
    public Car(){

    }
    public Car(String model)
    {
        this.model=model;
    }

}
