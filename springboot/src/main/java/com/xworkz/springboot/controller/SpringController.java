package com.xworkz.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springboot.dto.MessageDto;
import com.xworkz.springboot.service.MessageService;

@Controller
@RequestMapping("/")
public class SpringController {

	private static Logger logger = Logger.getLogger(SpringController.class);

	@Autowired
	private MessageService messageService;

	public SpringController() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/onAction")
	public String onAction() {
		logger.info("Invoked onAction");
		return "index";
	}

	@RequestMapping("/input.do")
	public String theMessage(MessageDto messageDto, Model model) {

		logger.info("Invoked theMessage()");

		try {
			
			messageDto = messageService.save(messageDto);
			model.addAttribute("message", messageDto.getMessage());
			model.addAttribute("from", messageDto.getName());
			return "displayMessage"; 
			
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage(), e);
			return "index";
		}

	}
}
