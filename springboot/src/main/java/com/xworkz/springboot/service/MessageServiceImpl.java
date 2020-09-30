package com.xworkz.springboot.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springboot.dto.MessageDto;
import com.xworkz.springboot.entity.SpringBootEntity;
import com.xworkz.springboot.repository.MessageRepo;


@Service
public class MessageServiceImpl implements MessageService {

	private static Logger logger = Logger.getLogger(MessageServiceImpl.class);
	
	@Autowired
	private MessageRepo messageRepo;

	public MessageServiceImpl() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public MessageDto save(MessageDto messageDto) {
		logger.info("Invoked save method");
		try {
			SpringBootEntity springBootEntity = new SpringBootEntity();
			springBootEntity.setName(messageDto.getName());
			springBootEntity.setMessage(messageDto.getMessage());
			springBootEntity = messageRepo.save(springBootEntity);
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage(), e);
		} 
		return messageDto;
	}
}
