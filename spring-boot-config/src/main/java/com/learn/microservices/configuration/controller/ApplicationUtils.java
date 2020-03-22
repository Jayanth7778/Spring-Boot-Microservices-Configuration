package com.learn.microservices.configuration.controller;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationUtils {

	@Value("${default.msg}")
	public static String msg;
}
