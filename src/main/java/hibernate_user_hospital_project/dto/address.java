package hibernate_user_hospital_project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hos_id;
	public int getHos_id() {
		return hos_id;
	}


	public void setHos_id(int hos_id) {
		this.hos_id = hos_id;
	}


	private String hos_name;
	private String street_number;
	private String street_name;
	private String city;
	private long pincode;
	
	
	@OneToOne
	private hospitalBranches hospital_brances;


	public String getHos_name() {
		return hos_name;
	}


	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}


	public String getStreet_number() {
		return street_number;
	}


	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}


	public String getStreet_name() {
		return street_name;
	}


	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public hospitalBranches getHospital_brances() {
		return hospital_brances;
	}


	public void setHospital_brances(hospitalBranches hospital_brances) {
		this.hospital_brances = hospital_brances;
	}


	@Override
	public String toString() {
		return "address [hos_id=" + hos_id + ", hos_name=" + hos_name + ", street_number=" + street_number
				+ ", street_name=" + street_name + ", city=" + city + ", pincode=" + pincode + ", hospital_brances="
				+ hospital_brances + "]";
	}
	
	
	
}
