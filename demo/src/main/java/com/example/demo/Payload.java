package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payload")
public class Payload {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	
	@Column(name="type")
	private String type;
	@Column(name="description")
	private String description;
	@Column(name="signal")
	private String signal;
	
	public Payload() {}
	
	public Payload (String type,String description,String signal) {
		this.type = type;
		this.description = description;
		this.signal = signal;
	}
	
	
	public void setType (String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}
	
	
	
	
}
