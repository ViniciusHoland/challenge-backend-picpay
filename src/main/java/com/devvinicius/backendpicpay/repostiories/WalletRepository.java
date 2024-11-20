package com.devvinicius.backendpicpay.repostiories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvinicius.backendpicpay.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

	Optional<Wallet> findByCpfCnpjOrEmail(String cpfCnpj, String email);

}
