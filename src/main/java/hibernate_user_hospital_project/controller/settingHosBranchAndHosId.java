package hibernate_user_hospital_project.controller;

import hibernate_user_hospital_project.dao.hospitalDao;

public class settingHosBranchAndHosId {

	public static void main(String[] args) {
		//setting hos id and hos branch (values are already saved)
		
		
		hospitalDao dao=new hospitalDao();
		
		dao.setHosIdHosBranch();

	}

}
