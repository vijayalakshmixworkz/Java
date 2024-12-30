package com.xworkz.snap.runner;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.snap.dto.Tdto;
public class TrainerQuery4 {
    public static void main(String[] args) {
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();

       
            List<Tdto> list = eM.createQuery("Select gd from TrainerDTO gd", Tdto.class).getResultList();

            for (Tdto trainers : list) {
                System.out.println("Trainer list===" + trainers.getId() + "===" + trainers.getAge() + "===" + trainers.getEmail() + "===" +
                        trainers.getExperienceYears() + "===" + trainers.getPhoneNo() + "===" + trainers.getSpecialization());
            }
        try {
            eT.begin();
            eT.commit();
            System.out.println("Trainer data processed successfully!");

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
                System.out.println("Transaction rolled back due to an error!");
            }
            e.printStackTrace();
        } finally {
            eM.close();
            eMF.close();
        }
    }
}