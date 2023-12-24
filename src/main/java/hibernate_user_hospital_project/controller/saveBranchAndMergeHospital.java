package hibernate_user_hospital_project.controller;

import java.util.ArrayList;
import java.util.List;

import hibernate_user_hospital_project.dao.hospitalDao;
import hibernate_user_hospital_project.dto.address;
import hibernate_user_hospital_project.dto.hospital;
import hibernate_user_hospital_project.dto.hospitalBranches;

public class saveBranchAndMergeHospital {

	public static void main(String[] args) {


		hospitalBranches hb1=new hospitalBranches();
		
		hb1.setName("Metha");
		hb1.setLocation("chennai");
		hb1.setPh_no(985756975l);
		
		hospitalBranches hb2 = new hospitalBranches();
		
		hb2.setName("Metha");
		hb2.setLocation("tirunelveli");
		hb2.setPh_no(95759855l);
		
		address a1=new address();
		
		a1.setCity("chennai");
		a1.setHos_name("Metha");
		a1.setStreet_name("Chetpet");
		a1.setStreet_number("No 9");
		a1.setPincode(98597l);
		
		a1.setHospital_brances(hb1);
		
		hb1.setAddress(a1);
		
		address a2=new address();
		
		a2.setCity("Tirunelveli");
		a2.setHos_name("Metha");
		a2.setStreet_name("vanniyar street");
		a2.setStreet_number("No 101");
		a2.setPincode(985698l);
		
		a2.setHospital_brances(hb2);
	
		hb2.setAddress(a2);
		
		
		hospitalDao dao=new hospitalDao();
		
		List<hospitalBranches> list=new ArrayList<hospitalBranches>();
		
		list.add(hb1);
		list.add(hb2);
		
		dao.saveBranchAndSetHospital(list,a1,a2);
	}
	
	

}
