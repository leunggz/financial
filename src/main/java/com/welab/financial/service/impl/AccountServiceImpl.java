/**
 * 
 */
package com.welab.financial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welab.financial.dao.AccountDao;
import com.welab.financial.entity.Account;
import com.welab.financial.service.AccountService;

/**
 * @author Administrator
 *
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	public AccountDao accountDao;

	public Account getAccountById(Long accountId) {		
		return accountDao.selectByPrimaryKey(accountId);
	}

	
	public void addAccount(Account account) {
		 accountDao.insert(account);
	}
	
	public void modifyAccount(Account account) {
		accountDao.updateByPrimaryKeySelective(account);

	}


	public void deleteAccountById(Long id) {
		accountDao.deleteByPrimaryKey(id);

	}

}
