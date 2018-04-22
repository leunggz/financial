/**
 * 
 */
package com.welab.financial.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.welab.financial.entity.Account;


/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class AccountTest {

	@Autowired
	private AccountService accountService;
	
	@Test
	public void testGetAccountById(){
		Account account = accountService.getAccountById(2L);
		System.err.println(account.getDetail());
	}
}
