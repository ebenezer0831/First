package hibernate_user_hospital_project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_user_hospital_project.dto.address;
import hibernate_user_hospital_project.dto.hospital;
import hibernate_user_hospital_project.dto.hospitalBranches;

public class hospitalDao {

	
	public EntityManager getManager(){
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("radha");
		EntityManager em=emf.createEntityManager();
		
		return em;
	}
	
	
	
	public void saveHospital(hospital apollo, hospitalBranches apollo_br1, hospitalBranches apollo_br2, address apollo_ad1, address apollo_ad2, hospital metha, address metha_ad1, address metha_ad2, hospitalBranches metha_br1, hospitalBranches metha_br2) {
		
		EntityManager em=getManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(apollo);
		em.persist(apollo_br1);
		em.persist(apollo_br2);
		em.persist(apollo_ad1);
		em.persist(apollo_ad2);
		em.persist(metha);
		em.persist(metha_ad1);
		em.persist(metha_ad2);
		em.persist(metha_br1);
		em.persist(metha_br2);
		et.commit();
	}



	public void saveBranchAndSetHospital(List<hospitalBranches> list1, address a1, address a2) {

		EntityManager em=getManager();
		
		EntityTransaction et= em.getTransaction();
		
		hospital h=em.find(hospital.class, 2);
		
		

		list1.addAll(h.getHospital_branches());
		h.setHospital_branches(list1);
		
		et.begin();
		
		for (hospitalBranches hb : list1) {
			
			hb.setHospital(h);
			em.persist(hb);
			
		}
		
		
		em.persist(h);
		
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
	}
	
	public void setHosIdHosBranch() {
		
		//setting hos id and hos branch (values are already saved)
		
		EntityManager em=getManager();
		
		EntityTransaction et=em.getTransaction();
		
		hospitalBranches hb1=em.find(hospitalBranches.class, 1);
		hospitalBranches hb2=em.find(hospitalBranches.class, 2);
		hospitalBranches hb5=em.find(hospitalBranches.class, 5);
		
		hospital h=em.find(hospital.class, 1);
		
		List<hospitalBranches> hb=new ArrayList<hospitalBranches>();
		
		hb.add(hb1);
		hb.add(hb2);
		hb.add(hb5);
		
		hb.addAll(h.getHospital_branches());
		
		h.setHospital_branches(hb);
		
		et.begin();
		em.persist(h);
		et.commit();
		
		
	}
	
	
}
