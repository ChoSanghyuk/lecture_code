package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Member member1 = new Member();
        member1.setId(3L);
        member1.setName("HelloA");
        em.persist(member1);
        member1.setName("HelloB");

//        Test test = new Test(3L, "col1_befroe", "col2_before");
//        em.persist(test);
//        test.setCol1("col1_after");


        transaction.commit();
        em.close();
        emf.close();


    }
}
