package com.devvinicius.backendpicpay.entities;

import java.math.BigDecimal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="cpf_cnpj",unique = true)
	private String cpfCnpj;
	
	@Column(name="email",unique = true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="balance")
	private BigDecimal balance = BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name="wallet_type_id")
	private WalletType walletType;

	public Wallet() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public WalletType getWalletType() {
		return walletType;
	}

	public void setWalletType(WalletType walletType) {
		this.walletType = walletType;
	}
	
	
	
	
	
}