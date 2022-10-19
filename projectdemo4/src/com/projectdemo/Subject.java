package com.projectdemo;

public class Subject {
	private int sub_id;
	private String sub_name;
	
	public Subject() {
		super();
	}
	
	public Subject( String sub_name) {
		super();
		this.sub_name = sub_name;
	}
	
	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", sub_name=" + sub_name + ", getSub_id()=" + getSub_id()
				+ ", getSub_name()=" + getSub_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public Subject(int sub_id, String sub_name) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
	}
	
	
}
