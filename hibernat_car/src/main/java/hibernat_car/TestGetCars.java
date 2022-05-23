package hibernat_car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetCars {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query= entityManager.createQuery("SELECT u FROM Car u WHERE u.brand=?1 and u.type=?2 ");
		query.setParameter(1,  "A6");
		query.setParameter(2, "Top end model");

		List<Car> cars = query.getResultList();
		if(cars.size() > 0){
			for(Car car : cars){
				System.out.println("Name is "+car.getName());
				System.out.println("Brand is "+car.getBrand());
				System.out.println("Cost is "+car.getCost());
				System.out.println("Type is "+car.getType());
			}
		}else{
			System.out.println("Sorry no cars found");

		}
	}

}
