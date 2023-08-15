package org.sprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.sprint.model.Customer;
import org.sprint.model.Wallet;
import org.sprint.service.WalletService;

@Controller
public class WalletController {
	@Autowired
	WalletService walletService;
	
	@RequestMapping("/welcome")
	public String getWelcomePage(Model model) {
		model.addAttribute("MyWebsiteTitle","PayPal");
		model.addAttribute("message","Welcome to Paypal!!The New Payment Gateway");
		return "welcome-page";
	}
	
	@RequestMapping("/customerPage")
	public String getCustomerPage(Model model) {
		model.addAttribute("message","Welcome to registration page");
	 return "addCustomer";
	}

	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(@ModelAttribute("cust") Customer cust) {
		walletService.customerSignIn(cust);
		ModelAndView modelAndView = new ModelAndView("registration-success");
		modelAndView.addObject("message", "Successfully added employee data");
		return modelAndView;
		}
	
    @RequestMapping("/moneyPage")
	public String getMoneyPage(Model model) {
    	model.addAttribute("message","Welcome to login page");
	return "addMoney";
	}

	
    @RequestMapping("/addMoney")
	public ModelAndView addMoney(@ModelAttribute("wallet") Wallet wallet) {
		walletService.addMoney(wallet);
		ModelAndView modelAndView = new ModelAndView("money-success");
		modelAndView.addObject("message","Successfully added money");
		return modelAndView;
	}
	
	
	

}
