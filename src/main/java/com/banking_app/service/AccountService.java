package com.banking_app.service;

import com.banking_app.dto.AccountDto;

public interface AccountService {
	
	//account rest end-points
	AccountDto createAccount(AccountDto account);
}