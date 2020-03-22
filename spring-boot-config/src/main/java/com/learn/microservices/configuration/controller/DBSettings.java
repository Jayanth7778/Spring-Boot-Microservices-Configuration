package com.learn.microservices.configuration.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DBSettings {

	private String connection;
	private String host;
	private int port;

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "DBSettings [connection=" + connection + ", host=" + host + ", port=" + port + "]";
	}

//	public Map<String, String> getConnection() {
//		return connection;
//	}
//
//	@Value("#{${db.connection}}")
//	public void setConnection(Map<String, String> connection) {
//		this.connection = connection;
//	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
