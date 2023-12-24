package hibernate_user_hospital_project.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hos_id;
	private String hos_name;
	private String hos_location;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<hospitalBranches> hospital_branches;

	public int getHos_id() {
		return hos_id;
	}

	public void setHos_id(int hos_id) {
		this.hos_id = hos_id;
	}

	public String getHos_name() {
		return hos_name;
	}

	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}

	public String getHos_location() {
		return hos_location;
	}

	public void setHos_location(String hos_location) {
		this.hos_location = hos_location;
	}

	public List<hospitalBranches> getHospital_branches() {
		return hospital_branches;
	}

	public void setHospital_branches(List<hospitalBranches> hospital_branches) {
		this.hospital_branches = hospital_branches;
	}

	@Override
	public String toString() {
		return "hospital [hos_id=" + hos_id + ", hos_name=" + hos_name + ", hos_location=" + hos_location
				+ ", hospital_branches=" + hospital_branches + "]";
	}
	
	
	
	

}
