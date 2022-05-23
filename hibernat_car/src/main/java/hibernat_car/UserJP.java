package hibernat_car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

//Delete
public class UserJP {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query= entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 and u.password=?2 ");
		query.setParameter(1,  "dinga@gmail.com");
		query.setParameter(2, "fdsd");

		List<User> users = query.getResultList();
		if(users.size() > 0){

			User user1 = users.get(0);
			System.out.println("Name is "+user1.getName());
			System.out.println("Eamil Id is "+user1.getEmail());
			System.out.println("gender "+user1.getGender());
		}
		else{
			System.out.println("Invalid user name or password");
		}
	}

}
