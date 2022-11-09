import java.util.ArrayList;
import java.util.List;

import OneToManyDTO.Phone;
import OneToManyDTO.Sim;
import SimDAO.SimDAO;

public class SimDriver {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setId(1);
		phone.setModel("Realme");
		phone.setStorage(4);
		phone.setEmi("sj7438");
		
		Sim sim = new Sim();
		sim.setId(1);
		sim.setProvider("jio");
		sim.setSimno(647383);
		sim.setPhone(phone);
		
		Sim sim1 = new Sim();
		sim1.setId(2);
		sim1.setProvider("Airtel");
		sim1.setSimno(8437829);
		sim1.setPhone(phone);
		
		List<Sim> siml= new ArrayList<Sim>();
		siml.add(sim);
		siml.add(sim1);
		
		phone.setSim(siml);
		
		SimDAO dao = new SimDAO();
		dao.save(phone);
	}

}
