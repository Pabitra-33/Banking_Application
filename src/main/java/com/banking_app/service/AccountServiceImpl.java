package com.banking_app.service;


import org.springframework.stereotype.Service;

import com.banking_app.dto.AccountDto;
import com.banking_app.entity.Account;
import com.banking_app.mapper.AccountMapper;
import com.banking_app.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);//saving the account
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}