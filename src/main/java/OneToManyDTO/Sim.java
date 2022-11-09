package OneToManyDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	
	@Id
	private int id;
	private String provider;
	private int simno;

	@ManyToOne
	private Phone phone ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getSimno() {
		return simno;
	}

	public void setSimno(int simno) {
		this.simno = simno;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
}
