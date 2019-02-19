package com.webbot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="content")
public class Content {
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String content;
	private String http_response;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHttp_response() {
		return http_response;
	}
	public void setHttp_response(String http_response) {
		this.http_response = http_response;
	}
	
	
}
