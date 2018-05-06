package com.welab.financial.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.welab.financial.entity.Account;
import com.welab.financial.service.AccountService;

@Controller
public class UserController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/showname",method=RequestMethod.GET)
	public String showUserName(@RequestParam("uid") Long uid,HttpServletRequest request,Model model){
		Account account = accountService.getAccountById(uid);
		if(account != null){
			request.setAttribute("name", account.getAccountId());
			model.addAttribute("mame", account.getAccountId());
			return "showName";
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}
}
