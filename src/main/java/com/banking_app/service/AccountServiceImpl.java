package com.banking_app.service;


import org.springframework.stereotype.Service;

import com.banking_app.dto.AccountDto;
import com.banking_app.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		
		return null;
	}

}