package com.Department.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private int strength;
	private String Address;
	private int Code;
	private String Head;
	private String Role;
	private String Status;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, int strength, String address, int code, String head) {
		super();
		this.id = id;
		Name = name;
		this.strength = strength;
		Address = address;
		Code = code;
		this.Head = head;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getHead() {
		return Head;
	}
	public void setHead(String head) {
		this.Head = head;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Name=" + Name + ", strength=" + strength + ", Address=" + Address + ", Code="
				+ Code + ", head=" + Head + "]";
	}
	
	
	
	

}
