package com.devvinicius.backendpicpay.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvinicius.backendpicpay.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

}
