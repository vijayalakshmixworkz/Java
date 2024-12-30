package com.xworkz.airpod.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.airpod.dto.AirpodEntity;

public class AirpodRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		AirpodEntity air = new AirpodEntity(0, null, null, null, 0, null, null, 0, 0, null);
		AirpodEntity air1 = new AirpodEntity(0, null, null, null, 0, null, null, 0, 0, null);
		AirpodEntity air2 = new AirpodEntity(0, null, null, null, 0, null, null, 0, 0, null);
		AirpodEntity air3 = new AirpodEntity(0, null, null, null, 0, null, null, 0, 0, null);
		AirpodEntity air4 = new AirpodEntity(0, null, null, null, 0, null, null, 0, 0, null);

		try {
			eT.begin();

			eM.persist(air);
			eM.persist(air);
			eM.persist(air);
			eM.persist(air);
			eM.persist(air);

			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			eM.close();
			eMF.close();
		}
	}
}
