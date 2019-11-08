package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank_Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;
	private String name;
	private String city;
	private String working_area;
	private String country;
	private int grade;
	private int initial_founds;
	private int found_limit;
	private int mensual_founds;
	private int found_extra_limit;
	private String phone_no;
	private String agent_number;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWorking_area() {
		return working_area;
	}

	public void setWorking_area(String working_area) {
		this.working_area = working_area;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getInitial_founds() {
		return initial_founds;
	}

	public void setInitial_founds(int initial_founds) {
		this.initial_founds = initial_founds;
	}

	public int getFound_limit() {
		return found_limit;
	}

	public void setFound_limit(int found_limit) {
		this.found_limit = found_limit;
	}

	public int getMensual_founds() {
		return mensual_founds;
	}

	public void setMensual_founds(int mensual_founds) {
		this.mensual_founds = mensual_founds;
	}

	public int getFound_extra_limit() {
		return found_extra_limit;
	}

	public void setFound_extra_limit(int found_extra_limit) {
		this.found_extra_limit = found_extra_limit;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAgent_number() {
		return agent_number;
	}

	public void setAgent_number(String agent_number) {
		this.agent_number = agent_number;
	}

	@Override
	public String toString() {
		return "Bank_Customer [id=" + id + ", name=" + name + ", city=" + city + ", working_area=" + working_area
				+ ", country=" + country + ", grade=" + grade + ", initial_founds=" + initial_founds + ", found_limit="
				+ found_limit + ", mensual_founds=" + mensual_founds + ", found_extra_limit=" + found_extra_limit
				+ ", phone_no=" + phone_no + ", agent_number=" + agent_number + "]";
	}

}
