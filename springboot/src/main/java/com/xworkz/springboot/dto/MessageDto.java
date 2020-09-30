package com.xworkz.springboot.dto;

import org.apache.log4j.Logger;

import lombok.Data;

@Data
public class MessageDto{
	
	private static Logger logger = Logger.getLogger(MessageDto.class);
	
	private Integer id;
	private String name;
	private String message;
	
	public MessageDto() {
		logger.info("Created \t"+ this.getClass().getSimpleName());
	}

}
