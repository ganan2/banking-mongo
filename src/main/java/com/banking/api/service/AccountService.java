package com.banking.api.service;

import java.security.Principal;

import com.banking.api.domain.PrimaryAccount;
import com.banking.api.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
