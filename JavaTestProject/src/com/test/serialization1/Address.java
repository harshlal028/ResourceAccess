package com.test.serialization1;

import com.test.serialization.Serial;

public class Address implements Serial{

	private static final long serialVersionUID = -7706677152556070949L;
	
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