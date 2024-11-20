package com.devvinicius.backendpicpay.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvinicius.backendpicpay.entities.WalletType;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long>{

}
