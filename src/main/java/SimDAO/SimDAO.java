package SimDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToManyDTO.Phone;
import OneToManyDTO.Sim;

public class SimDAO {

	public void save(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(phone);
		List<Sim> sim = phone.getSim();
		for (Sim sims : sim) {
			entityManager.persist(sims);
		}
		entityTransaction.commit();

	}

}
