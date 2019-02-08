package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	private String id;
	private String name;
	private String descr;
	private String topicId;
	
	public Courses() {};
	
	public Courses(String id, String name, String descr, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descr = descr;
		this.topicId = topicId;
	}
	
	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

	
}
