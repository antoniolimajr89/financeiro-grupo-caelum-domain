package br.com.caelum.financeiro.domain;

public enum CustomerType {

	PF("Pessoa Física"),
	PJ("Pessoa Jurídica"),
	EST_PF("Pessoa Física Estrangeira"),
	EST_PJ("Pessoa Jurídica Estrangeira");
	
	private final String description;
	
	private CustomerType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}
