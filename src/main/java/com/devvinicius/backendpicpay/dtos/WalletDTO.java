package com.devvinicius.backendpicpay.dtos;

import com.devvinicius.backendpicpay.entities.Wallet;
import com.devvinicius.backendpicpay.entities.WalletType;

public record WalletDTO (String fullName,
		String cpfCnpj,String email,String password, WalletType.Enum walletType){
	
	public Wallet toWallet() {
		return new Wallet(
			fullName,
			cpfCnpj,
			email,
			password,
			walletType.get()
		);
	}
}
