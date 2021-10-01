package com.bhargavi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhargavi.model.AdminDTO;
import com.bhargavi.model.ProductDTO;
import com.bhargavi.model.UserDTO;

@Component
public class ProductDAOImp implements ProductDAO {
	@Autowired
	EntityManagerFactory factory;

	@Override
	public void adminreg(AdminDTO adto) {
		System.out.println("Data received by dao and persists it to the database");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(adto);
		transaction.commit();
		manager.close();
	}

	@Override
	public void userreg(UserDTO udto) {
		System.out.println("Data received by dao and persists it to the database");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(udto);
		transaction.commit();
		manager.close();
	}

	@Override
	public UserDTO loginValidationUser(String username, String password) {
		System.out.println("dao perform login validation with the database");
		try {
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createQuery("from UserDTO where username=?0 and password=?1");
			query.setParameter(0, username);
			query.setParameter(1, password);
			return (UserDTO) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

	@Override
	public AdminDTO loginValidationAdmin(String username, String password) {
		System.out.println("dao perform login validation with the database");
		try {
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createQuery("from AdminDTO where username=?0 and password=?1");
			query.setParameter(0, username);
			query.setParameter(1, password);
			return (AdminDTO) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

	@Override
	public String save(ProductDTO pdto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(pdto);
		transaction.commit();
		manager.close();
		return null;
	}

	@Override
	public int updateQuantity(String pName, int pQuantity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager
					.createQuery("update ProductDTO set pQuantity='" + pQuantity + "' where pName='" + pName + "'");
			int row = query.executeUpdate();
			transaction.commit();
			return row;
		} catch (NoResultException e) {
			return 0;
		}
	}

	@Override
	public int updatePrice(String pName, double pPrice) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager
					.createQuery("update ProductDTO set pPrice='" + pPrice + "' where pName='" + pName + "'");
			int row = query.executeUpdate();
			transaction.commit();
			return row;
		} catch (NoResultException e) {
			return 0;
		}

	}

	@Override
	public int delete(String pName) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createQuery("delete from ProductDTO where pName='" + pName + "'");
			int row = query.executeUpdate();
			transaction.commit();
			return row;
		} catch (NoResultException e) {
			return 0;
		}

	}

	@Override
	public List<ProductDTO> search(String type, String key) {
		EntityManager manager=factory.createEntityManager();

		List<ProductDTO> lispdto = null;
		Query query = null;
		if (type.equals("Select_By_Name")) {
			query = manager.createQuery("from ProductDTO where pName='" + key + "'");
			lispdto = query.getResultList();
		} else if (type.equals("Select_By_Category")) {
			query = manager.createQuery("from ProductDTO where pCategory='" + key + "'");
			lispdto = query.getResultList();

		} else if (type.equals("Select_By_Company")) {
			query = manager.createQuery("from ProductDTO where pCompany='" + key + "'");
			lispdto = query.getResultList();
		}
		manager.close();
		return lispdto;	}

}
