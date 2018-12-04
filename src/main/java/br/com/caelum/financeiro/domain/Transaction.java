package br.com.caelum.financeiro.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Transaction {
	
	private Long id;
	private LocalDate date;
	private Customer customer;
	private List<Product> products;
	private LocalDate accessDate;
	private String paymentMethod;
	private Integer numberOfInstallments;
	private Boolean renewal;
	
	@SuppressWarnings("unused")
	private Transaction() {
	}
	
	public Transaction(Long id, LocalDate date, Customer customer, List<Product> products, LocalDate accessDate, String paymentMethod, Integer numberOfInstallments, Boolean renewal) {
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.products = products;
		this.accessDate = accessDate;
		this.paymentMethod = paymentMethod;
		this.numberOfInstallments = numberOfInstallments;
		this.renewal = renewal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, customer, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Transaction other = (Transaction)obj;
		return Objects.equals(date, other.date) && Objects.equals(customer, other.customer) && Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", customer=" + customer + "]";
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public LocalDate getAccessDate() {
		return accessDate;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}
	
	public Boolean getRenewal() {
		return renewal;
	}
	
	public BigDecimal getTotalAmount() {
		BigDecimal totalAmount = BigDecimal.ZERO;

		for (Product p : this.products) {
			totalAmount = totalAmount.add(p.getTotalPrice());
		}

		return totalAmount;
	}
	
	public String getDescription() {
		String description = " ";

		for (Product p : this.products) {
			description.concat(p.getDescription());
		}

		return description;
	}
	
}
