package com.xworkz.resort.resortRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.resort.resortEntity.REntity;

import java.util.List;

public class ResortQueryRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		Query query = eM.createNamedQuery("findAll");
		List<REntity> list = query.getResultList();
		list.forEach(res -> System.out.println(res));
		System.out.println("-----------------------------------------");
		
		Query q1 = eM.createNamedQuery("findById");
		q1.setParameter("byId", 1);
		List<String> results = q1.getResultList();
		if (!results.isEmpty()) {
		    System.out.println("resort_name: " + results.get(0));
		} else {
		    System.out.println("No resort found with the given ID.");
		}

		Query q2 = eM.createNamedQuery("findByName");
		q2.setParameter("byName", "Mango Forest Resort");
		List<Float> ratings = q2.getResultList();
		if (!ratings.isEmpty()) {
		    System.out.println("rating: " + ratings.get(0));
		} else {
		    System.out.println("No resort found with the given name.");
		}

		Query q3 = eM.createNamedQuery("findByRating");
		q3.setParameter("byRating", 4.2f);
		List<Double> result = q3.getResultList();
		if (result.isEmpty()) {
		    System.out.println("No result found for the given rating.");
		} else {
		    System.out.println("cost_per_night: " + result.get(0));
		}

		Query q4=eM.createNamedQuery("findRevenue");
		q4.setParameter("Location", "Nandi Hills, Bangalore");
		Object ob4=q4.getSingleResult();
		Long str4=(Long)ob4;
		System.out.println("total_revenue:"+str4);
		System.out.println("-----------------------------------------");

		Query q5=eM.createNamedQuery("findByLocation");
		q5.setParameter("byLocation", "Yelahanka, Bangalore");
		Object ob5=q5.getSingleResult();
		Integer id5=(Integer)ob5;
		System.out.println("id:"+id5);
		System.out.println("-----------------------------------------");
		
		try {
			eT.begin();
			eT.commit();
		} catch (Exception e) {
			if (eT.isActive()) {
				eT.rollback();
			}
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}
	}
}
