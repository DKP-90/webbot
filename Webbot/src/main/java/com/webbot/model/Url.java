package com.webbot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="url")
public class Url {
@Id
@GeneratedValue
	private int id;
	private String url;
	
//	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name="id")
//	private Content Content_type;	
//	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="id")
//	private Link Link_type;
//	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="id")
//	private Media Media_type;
//	
	
	
//	public Content getContent_type() {
//		return Content_type;
//	}
//	public void setContent_type(Content content_type) {
//		Content_type = content_type;
//	}
//	public Link getLink_type() {
//		return Link_type;
//	}
//	public void setLink_type(Link link_type) {
//		Link_type = link_type;
//	}
//	public Media getMedia_type() {
//		return Media_type;
//	}
//	public void setMedia_type(Media media_type) {
//		Media_type = media_type;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
