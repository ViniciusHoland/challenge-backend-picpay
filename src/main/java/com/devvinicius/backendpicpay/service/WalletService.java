package com.devvinicius.backendpicpay.service;

import org.springframework.stereotype.Service;

import com.devvinicius.backendpicpay.dtos.WalletDTO;
import com.devvinicius.backendpicpay.entities.Wallet;
import com.devvinicius.backendpicpay.exceptions.WalletDataAlreadyExistsException;
import com.devvinicius.backendpicpay.repostiories.WalletRepository;

@Service
public class WalletService {

	private final WalletRepository walletRepository;
	
	
	
	
	public WalletService(WalletRepository walletRepository) {
		super();
		this.walletRepository = walletRepository;
	}


	public Wallet createWallet(WalletDTO walleDTO) {
		
		var wallet =  walletRepository.findByCpfCnpjOrEmail(walleDTO.cpfCnpj(), walleDTO.email());
		
		if(wallet.isPresent()) {
			throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
		}
		
		return walletRepository.save(walleDTO.toWallet());
		
	}
	
	

}
