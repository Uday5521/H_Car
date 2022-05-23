package hibernat_car;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		Review review = new Review();
		review.setSubject("Worth for money");
		review.setContent("Product is too good. I am using from past six monts and no complaints");
		review.setWriterName("Uday");
		
		
		// It will automatically updated date and time in review class 
		// by using creation date and time
//		review.setCreateDateTime(LocalDateTime.now());
//		review.setUpdateDateTiime(LocalDateTime.now());

		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
		
	}

}
