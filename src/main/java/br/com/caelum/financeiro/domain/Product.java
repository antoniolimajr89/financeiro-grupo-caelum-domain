package br.com.caelum.financeiro.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
	
	private String description;
	private Integer quantity;
	private BigDecimal price;
	private String NCMCode;
	private Integer durationInDays;
	private String type;
	
	@SuppressWarnings("unused")
	private Product() {
	}
	
	public Product(String description, Integer quantity, BigDecimal price, String NCMCode, Integer durationInDays, String type) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.NCMCode = NCMCode;
		this.durationInDays = durationInDays;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, quantity, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Product other = (Product)obj;
		return Objects.equals(description, other.description) && Objects.equals(quantity, other.quantity) && Objects.equals(price, other.price);
	}
	
	@Override
	public String toString() {
		return "Product[Description: " +this.description +"]";
	}

	public String getDescription() {
		return description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public String getNCMCode() {
		return NCMCode;
	}
	public Integer getDurationInDays() {
		return durationInDays;
	}
	public String getType() {
		return type;
	}
	
	public BigDecimal getTotalPrice() {
		return price.multiply(BigDecimal.valueOf(quantity));
	}
	
}
