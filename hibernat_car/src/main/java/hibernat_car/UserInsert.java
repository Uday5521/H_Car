package hibernat_car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserInsert {
	public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	User u = new User();
	u.setId(1);
	u.setName("Dinga");
	u.setEmail("dinga@gmail.com");
	u.setPassword("dinga");
	u.setGender('m');

	entityTransaction.begin();
	entityManager.persist(u);
	entityTransaction.commit();
	System.out.println("update Sucessfully");
	}
}
