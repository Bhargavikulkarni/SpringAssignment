package com.bhargavi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhargavi.dao.ProductDAO;
import com.bhargavi.model.AdminDTO;
import com.bhargavi.model.ProductDTO;
import com.bhargavi.model.UserDTO;

@Component
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductDAO dao;

	@Override
	public void adminreg(AdminDTO adto) {
		System.out.println(adto.getUsername() + "");
		dao.adminreg(adto);

	}

	@Override
	public void userreg(UserDTO udto) {
		System.out.println(udto.getUsername() + "");
		dao.userreg(udto);

	}

	@Override
	public UserDTO loginValidationUser(String username, String password) {
		System.out.println(username + "otp verification");
		return dao.loginValidationUser(username, password);
	}

	@Override
	public AdminDTO loginValidationAdmin(String username, String password) {
		System.out.println(username + "otp verification");
		return dao.loginValidationAdmin(username, password);
	}

	@Override
	public String save(ProductDTO pdto) {
		return dao.save(pdto);
	}

	@Override
	public int updateQuantity(String pName, int pQuantity) {
		return dao.updateQuantity(pName, pQuantity);
	}

	@Override
	public int updatePrice(String pName, double pPrice) {
		return dao.updatePrice(pName, pPrice);
	}

	@Override
	public int delete(String pName) {
		return dao.delete(pName);
	
	}

	@Override
	public List<ProductDTO> search(String type, String key) {
		return dao.search(type,  key);	}

}