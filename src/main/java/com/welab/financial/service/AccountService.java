/**
 * 
 */
package com.welab.financial.service;

import com.welab.financial.entity.Account;

/**
 * @author Administrator
 *
 */
public interface AccountService {

	public Account getAccountById(Long accountId);
	
	public void addAccount(Account account);
	
	public void modifyAccount(Account account);
	
	public void deleteAccount(Account account);
	
}
