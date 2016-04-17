package com.amt.petclinic.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Owner;

@Transactional
public class OwnerDAO {
	private SessionFactory sessionFactory;

	public OwnerDAO() {
		super();
	}

	public OwnerDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Owner> findAll() {
		List<Owner> ownerList = null;
		try {
			ownerList = new ArrayList<Owner>();
			Query query = sessionFactory.getCurrentSession().createQuery("FROM Owner o");
			ownerList = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ownerList;
	}

	public void create(Owner owner) {
		try {
			sessionFactory.getCurrentSession().persist(owner);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
