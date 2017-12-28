package com.iotek.ssm.entity;

public class Department {
	
	private int id;
	private int name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	public Department() {
		super();
	}
	public Department(int id, int name) {
		super();
		this.id = id;
		this.name = name;
	}

}
