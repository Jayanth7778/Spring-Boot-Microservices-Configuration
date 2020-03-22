package com.learn.microservices.configuration.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

	@Value("${app.description}")
	private String msg;

	@Value("#{${db.connection}}")
	private Map<String, String> map;

	@Value("${list.values}")
	private List<String> values;

	@Autowired
	private DBSettings dbSettings;
	
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		dbSettings.toString();
//		System.out.println(values);
//		map.forEach((key, value) -> {
//			System.out.println(key + " = " + value);
//		});
		return msg + " " + values + " " + map + " " + dbSettings.toString();
	}

	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
	}
}
