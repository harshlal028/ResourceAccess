package com.test.serialization;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 6288110706088726211L;
	
	String street;
	String country;
	int population;

	public void setStreet(String street){
		this.street = street;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getStreet(){
		return this.street;
	}

	public String getCountry(){
		return this.country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return new StringBuffer(" Street : ")
				.append(this.street)
				.append(" Country : ")
				.append(this.country)
				.append(" Pop : ")
				.append(this.population).toString();
	}
	   
}