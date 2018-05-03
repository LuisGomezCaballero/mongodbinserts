package com.luisgomezcaballero.mongodbinserts;

import org.springframework.data.annotation.Id;

public class MyEntity {

	@Id
	public String Id;

	public String text;
	public String user_name;
	public String status;

	public MyEntity() {
	}

	public MyEntity(String text, String user_name, String status) {
		super();
		this.text = text;
		this.user_name = user_name;
		this.status = status;
	}

	@Override
	public String toString() {
		return "MyEntity [Id=" + Id + ", text=" + text + ", user_name=" + user_name + ", status=" + status
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
