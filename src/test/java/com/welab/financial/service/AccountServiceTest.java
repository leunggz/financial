/**
 * 
 */
package com.welab.financial.service;

import java.util.Date;

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
public class AccountServiceTest {

	@Autowired
	public AccountService accountService;
	@Test
	public void testGetAccountById(){
		Account account = accountService.getAccountById(2L);
		System.err.println(account.getDetail());
	}
	
	@Test
	public void testAddAccount(){
		Account account = new Account();
		account.setCreateTime(new Date());
		account.setDescription("hello");
		account.setDetail("吃饭");
		account.setMoney(100.02);
		account.setPaymentTerm("wechat");
		accountService.addAccount(account);
		System.err.println("end");
	}
	
	@Test
	public void testDeleteAccount(){
		accountService.deleteAccountById(10L);
		System.err.println("end");
	}
	
	@Test
	public void testModifyAccountById(){
		Account account = accountService.getAccountById(13L);
		account.setDescription("samre");
		accountService.modifyAccount(account);
		System.err.println("haha");
	}
}
