package com.xworkz.movieProject.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.movieProject.entity.MovieEntity;


public class MovieInsertRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		List<MovieEntity> movieEntities=new ArrayList<>();
		movieEntities.add(new MovieEntity(1,"Arya","Narthan",657765523,300.0f) );
		movieEntities.add(new MovieEntity(2,"Ditto","viji",657709766,250.0f) );
		movieEntities.add(new MovieEntity(3,"Bahubali","prashanth",650888523,300.0f) );
		movieEntities.add(new MovieEntity(4,"Abhi","Puneeth",659987523,300.0f) );
		for (MovieEntity entity : movieEntities) {
			System.out.println(entity);
		}

		try {
			eT.begin();
			for (MovieEntity movie : movieEntities) {
				eM.persist(movie);
			}
			eT.commit();
			System.out.println("movieEntities transaction data saved successfully.");
		} catch (Exception e) {
			if (eT.isActive()) {
				System.out.println("Rolling back transaction...");
				eT.rollback();
				System.out.println("Transaction rolled back due to error.");
			}
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}
}
}
	