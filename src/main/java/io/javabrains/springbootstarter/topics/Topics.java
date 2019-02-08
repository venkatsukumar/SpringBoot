package io.javabrains.springbootstarter.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

	@Id
	private String id;
	private String name;
	private String descr;
	
	public Topics() {};
	
	public Topics(String id, String name, String descr) {
		super();
		this.id = id;
		this.name = name;
		this.descr = descr;
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
