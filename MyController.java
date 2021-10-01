package com.bhargavi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhargavi.model.AdminDTO;
import com.bhargavi.model.ProductDTO;
import com.bhargavi.model.UserDTO;
import com.bhargavi.service.ProductService;

@Controller
public class MyController {

	@Autowired
	private ProductService service;

	@RequestMapping("/admin")
	public String getView1() {
		return "adminLogin";
	}

	@RequestMapping("/user")
	public String getView2() {
		return "userLogin";
	}

	@RequestMapping("/adminRegister")
	public String admiRegister() {
		return "admiRegistration";
	}

	@RequestMapping("/userRegister")
	public String userRegister() {
		return "userRegistration";
	}

	@RequestMapping("/addProducts")
	public String add() {
		return "addProduct";
	}

	@RequestMapping("/updateProductQuantity")
	public String getView3() {
		return "updateQuantity";
	}

	@RequestMapping("/updateProductPrice")
	public String getView4() {
		return "updatePrice";
	}
	
	@RequestMapping("/removeProducts")
	public String getView5() {
		return "removeProduct";
	}
	
	@RequestMapping("/searchProduct")
	public String getbyname() {
		return "searchproducts";
	}


	@PostMapping("/registerAdmin")
	public String resisterAdmin(@ModelAttribute AdminDTO adto) {
		System.out.println("Data received by controller");
		service.adminreg(adto);
		return "register";
	}

	@PostMapping("/registerUser")
	public String resisterUser(@ModelAttribute UserDTO udto) {
		System.out.println("Data received by controller");
		service.userreg(udto);
		return "register";
	}

	@PostMapping("/loginAdmin")
	public ModelAndView loginadmin(@RequestParam String username, @RequestParam String password) {
		System.out.println("data recieved by controller and pass it to the service");
		AdminDTO adto = service.loginValidationAdmin(username, password);
		if (adto != null) {
			return new ModelAndView("successAdmin", "adto", adto);
		} else {
			return new ModelAndView("adminLogin", "msg", "login failed plz try again");
		}
	}

	@PostMapping("/loginUser")
	public ModelAndView loginuser(@RequestParam String username, @RequestParam String password) {
		System.out.println("data recieved by controller and pass it to the service");
		UserDTO udto = service.loginValidationUser(username, password);
		if (udto != null) {
			return new ModelAndView("successUser", "adto", udto);
		} else {
			return new ModelAndView("userLogin", "msg", "login failed plz try again");
		}
		
		
	}

	@PostMapping("/addProducts")
	public String add(@ModelAttribute ProductDTO pdto) {
		service.save(pdto);
		return "productAdded";
	}

	@PostMapping("/quantityUpdate")
	public String updateQuantity(@RequestParam String pName, @RequestParam int pQuantity) {
		int row = service.updateQuantity(pName, pQuantity);
		if (row == 1) {
			return "updated";
		} else {
			return "failedUpdate";

		}
	}

	@PostMapping("/priceUpdate")
	public String updatePrice(@RequestParam String pName, @RequestParam double pPrice) {
		int row = service.updatePrice(pName, pPrice);
		if (row == 1) {
			return "updated";
		} else {
			return "failedUpdate";

		}
	}
	@PostMapping("/deleteProduct")
	public String delete(@RequestParam String pName) {
		int row = service.delete(pName);
		if (row == 1) {
			return "deleteSuccess";
		} else {
			return "deleteFailed";

		}
	}

	@PostMapping("/search")
	public ModelAndView SearchProduct(@RequestParam String type, @RequestParam String key) {
		List<ProductDTO> lispdto =service.search(type, key);
		System.out.println(lispdto);
		if (lispdto != null && !lispdto.isEmpty()) {
				return new ModelAndView("getrecord","lispdto",lispdto);
			}else {
			return new ModelAndView("searchfail");
		}
}
}