package br.com.caelum.financeiro.domain;

import java.util.Objects;

public class Address {
	
	private String country;
	private String state;
	private String city;
	private String zipCode;
	private String street;
	private String number;
	private String district;

	
	@SuppressWarnings("unused")
	private Address() {
	}
	
	public Address(String country, String state, String city, String zipCode, String street, String number, String district) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;
		this.number = number;
		this.district = district;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(country, state, city, zipCode, street, number, district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Address other = (Address)obj;
		return Objects.equals(country, other.country) && Objects.equals(state, other.state)
				&& Objects.equals(city, other.city) && Objects.equals(zipCode, other.zipCode)
				&& Objects.equals(street, other.street) && Objects.equals(number, other.number)
				&& Objects.equals(district, other.district);
	}

	@Override
	public String toString() {
		return "Address[Country: " +this.country +" State: " +this.state +" City: " +this.city +" Zip Code: " +this.zipCode +" Street: " +this.street +" Number: " +this.number +" District: " +this.district +"]";
	}

	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getStreet() {
		return street;
	}
	public String getNumber() {
		return number;
	}
	public String getDistrict() {
		return district;
	}
}
