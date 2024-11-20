package com.devvinicius.backendpicpay.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.devvinicius.backendpicpay.entities.WalletType;
import com.devvinicius.backendpicpay.repostiories.WalletTypeRepository;

@Configuration
public class DataLoader implements CommandLineRunner {

	private final WalletTypeRepository walletTypeRepository;
	
	public DataLoader(WalletTypeRepository walletTypeRepository) {
		this.walletTypeRepository = walletTypeRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Arrays.stream(WalletType.Enum.values())
		.forEach(walletType -> walletTypeRepository.save(walletType.get()));
		
	}
}
