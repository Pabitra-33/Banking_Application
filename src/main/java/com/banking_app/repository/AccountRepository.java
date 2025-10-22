package com.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking_app.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}