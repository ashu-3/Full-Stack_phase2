package com.projectdemo;

public class Teachers {
	
	private int teacher_id;
	private String teacher_name;
	
	public Teachers() {
		super();
	}
	
	public Teachers(String teacher_name) {
		super();
		this.teacher_name = teacher_name;
	}
	
	public Teachers(int teacher_id, String teacher_name) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	@Override
	public String toString() {
		return "Teachers [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", getTeacher_id()="
				+ getTeacher_id() + ", getTeacher_name()=" + getTeacher_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
