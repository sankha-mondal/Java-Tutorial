package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.dao.AccountDao;

@Service
public class AccountService {

	@Autowired
	AccountDao accountDao;
	
	public String createAccount(Account account) {
		boolean res = accountDao.existsById(account.getAccno());
		if(res) {
			return "Account didn't create";
		} else {
			accountDao.save(account);
			return "Account created successfully";
		}
	}
	
	public String getAccountDetails(int accno) {
		Optional<Account> op = accountDao.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			return "You name is "+acc.getName()+" and your balance amount is "+acc.getAmount();
		}else {
			return "Account number not present";
		}
	}
}

