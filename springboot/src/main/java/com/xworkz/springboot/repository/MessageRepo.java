package com.xworkz.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.xworkz.springboot.entity.SpringBootEntity;


public interface MessageRepo extends CrudRepository<SpringBootEntity, Integer> {

}
