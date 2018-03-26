package br.com.caelum.financeiro.domain;

import java.util.Objects;

public class Customer {

	private CustomerType type;
	private String name;
	private String email;
	private String document;
	private Address address;

	@SuppressWarnings("unused")
	private Customer() {
	}
	
	public Customer(CustomerType type, String name, String email, String document, Address address) {
		this.type = type;
		this.name = name;
		this.email = email;
		this.document = document;
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(document);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Customer other = (Customer)obj;
		return Objects.equals(document, other.document);
	}

	@Override
	public String toString() {
		return "Customer[Type: " +this.type +" Name: " +this.name +" Document: " +this.document +"]";
	}

	public CustomerType getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDocument() {
		return document;
	}
	public Address getAddress() {
		return address;
	}
	
}
