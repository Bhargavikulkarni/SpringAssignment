package com.bhargavi.service;

import java.util.List;

import com.bhargavi.model.AdminDTO;
import com.bhargavi.model.ProductDTO;
import com.bhargavi.model.UserDTO;

public interface ProductService {
	void adminreg(AdminDTO adto);

	void userreg(UserDTO udto);

	UserDTO loginValidationUser(String username, String password);

	AdminDTO loginValidationAdmin(String username, String password);

	String save(ProductDTO pdto);

	int updateQuantity(String pName, int pQuantity);

	int updatePrice(String pName, double pPrice);

	int delete(String pName);

	List<ProductDTO> search(String type, String key);

}
