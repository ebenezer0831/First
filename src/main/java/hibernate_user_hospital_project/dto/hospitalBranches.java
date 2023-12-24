package hibernate_user_hospital_project.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class hospitalBranches {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branch_id;
	private String name;
	private long ph_no;
	private String location;

	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private hospital hospital;
	
	@OneToOne
	private address address;

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPh_no() {
		return ph_no;
	}

	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public hospital getHospital() {
		return hospital;
	}

	public void setHospital(hospital hospital) {
		this.hospital = hospital;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "hospitalBranches [branch_id=" + branch_id + ", name=" + name + ", ph_no=" + ph_no + ", location="
				+ location + "]";
	}
	
	
	
	
}
