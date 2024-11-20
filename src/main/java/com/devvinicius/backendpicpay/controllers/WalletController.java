package com.devvinicius.backendpicpay.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devvinicius.backendpicpay.dtos.WalletDTO;
import com.devvinicius.backendpicpay.entities.Wallet;
import com.devvinicius.backendpicpay.service.WalletService;

@RestController

public class WalletController {

	private final WalletService walletService;

	public WalletController(WalletService walletService) {
		
		this.walletService = walletService;
	}
	
	@PostMapping("/wallets")
	public ResponseEntity<Wallet> createWallet(@RequestBody WalletDTO walleDTO){
		
		var wallet = walletService.createWallet(walleDTO);
		
		return ResponseEntity.ok(wallet);
	}
	
	
	
}
