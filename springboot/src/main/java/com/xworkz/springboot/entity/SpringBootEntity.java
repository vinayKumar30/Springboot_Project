package com.xworkz.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="details")
@Data
public class SpringBootEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(SpringBootEntity.class);
	
	@Id
	@GenericGenerator(name="sboot",strategy="increment")
	@GeneratedValue(generator="sboot")
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="message")
	private String message; 
	

	public SpringBootEntity() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}
}
