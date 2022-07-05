package com.TestProject.jpaonetoonerelation.model;
import javax.persistence.*;


@Entity
@Table(name="Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "car_id",referencedColumnName = "id")
    private com.TestProject.jpaonetoonerelation.model.Car car;
    public Owner(){

    }
    public Owner(String name){
        this.name=name;
    }

    public void setCar(com.TestProject.jpaonetoonerelation.model.Car car) {
        this.car = car;
    }
}
