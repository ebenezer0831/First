package hibernate_user_hospital_project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hibernate_user_hospital_project.dao.hospitalDao;
import hibernate_user_hospital_project.dto.address;
import hibernate_user_hospital_project.dto.hospital;
import hibernate_user_hospital_project.dto.hospitalBranches;

public class singleShotSaving {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		hospital apollo = new hospital();
		
		hospitalBranches apollo_br1=new hospitalBranches();
		hospitalBranches apollo_br2 = new hospitalBranches();
		
		address apollo_ad1=new address();
		address apollo_ad2=new address();
		
		
		apollo.setHos_name("Apollo");
		apollo.setHos_location("Delhi");
		
		apollo_br1.setName("Apollo");
		apollo_br1.setLocation("Chennai");
		apollo_br1.setPh_no(858575128l);
		
		apollo_br2.setName("Apollo");
		apollo_br2.setLocation("CBE");
		apollo_br2.setPh_no(857546554l);
		
		
		apollo_ad1.setHos_name("Apollo");
		apollo_ad1.setStreet_name("Greams road");
		apollo_ad1.setStreet_number("No 10");
		apollo_ad1.setCity("Chennai");
		apollo_ad1.setPincode(600006l);
		
		apollo_ad2.setHos_name("Apollo");
		apollo_ad2.setStreet_name("Karamedu");
		apollo_ad2.setStreet_number("No 10");
		apollo_ad2.setCity("CBE");
		apollo_ad2.setPincode(600246l);
		
		List<hospitalBranches> apollo_hos_br=new ArrayList<hospitalBranches>();
		
		apollo_hos_br.add(apollo_br1);
		apollo_hos_br.add(apollo_br2);
		
		apollo.setHospital_branches(apollo_hos_br);
		
		
		apollo_br1.setHospital(apollo);
		apollo_br1.setAddress(apollo_ad1);
		apollo_br2.setAddress(apollo_ad2);
		apollo_br2.setHospital(apollo);
		
		
		apollo_ad1.setHospital_brances(apollo_br1);
		apollo_ad2.setHospital_brances(apollo_br2);
		
		
		hospital metha=new hospital();
		
		metha.setHos_name("Metha");
		metha.setHos_location("Mumbai");
		
		hospitalBranches metha_br1=new hospitalBranches();
		hospitalBranches metha_br2=new hospitalBranches();
		
		
		metha_br1.setName("Metha");
		metha_br1.setLocation("Chennai");
		metha_br1.setPh_no(855875525l);
		metha_br1.setHospital(metha);
		
		metha_br2.setName("Metha");
		metha_br2.setLocation("madurai");
		metha_br2.setPh_no(855875525l);
		metha_br2.setHospital(metha);
		
		List<hospitalBranches> metha_hos_br=new ArrayList<hospitalBranches>();
		
		metha_hos_br.add(metha_br1);
		metha_hos_br.add(metha_br2);
		
		metha.setHospital_branches(metha_hos_br);
		
		
		address metha_ad1=new address();
		
		
		metha_ad1.setHos_name("Metha");
		metha_ad1.setStreet_name("Kodambakkam trustpuram");
		metha_ad1.setStreet_number("No 258");
		metha_ad1.setPincode(600026l);
		
		metha_ad1.setCity("Chennai");
		metha_ad1.setHospital_brances(metha_br1);
		
		metha_br1.setAddress(metha_ad1);
		
		
		address metha_ad2=new address();
		
		metha_ad2.setHos_name("Metha");
		metha_ad2.setStreet_name("Vallalar");
		metha_ad2.setStreet_number("No 100");
		metha_ad2.setPincode(6447551l);
		metha_ad2.setCity("madurai");
		metha_ad2.setHospital_brances(metha_br2);
		
		metha_br2.setAddress(metha_ad2);
		
		hospitalDao hos_dao=new hospitalDao();
		
		hos_dao.saveHospital(apollo,apollo_br1,apollo_br2,apollo_ad1,apollo_ad2,metha,metha_ad1,metha_ad2,metha_br1,metha_br2);
		

	}

}
