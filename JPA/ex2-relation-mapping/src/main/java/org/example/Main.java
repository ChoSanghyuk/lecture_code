package org.example;

import org.example.entity.Category;
import org.example.entity.Item;
import org.example.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Item item1 = new Item();
        item1.setName("1");
        item1.setPrice(100);
        item1.setStockQuantity(5);

        Item item2 = new Item();
        item2.setName("2");
        item2.setPrice(100);
        item2.setStockQuantity(5);

        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();

//        item1.getCategories().add(category1);
//        item1.getCategories().add(category2);
//        item1.getCategories().add(category3);
//        item2.getCategories().add(category1);
//        item2.getCategories().add(category2);

        category1.getItems().add(item1);
        category1.getItems().add(item2);
        category2.getItems().add(item1);

        category3.getItems().add(item1);
        category3.getItems().add(item1);

        em.persist(item1);
        em.persist(item2);
        em.persist(category1);
        em.persist(category2);
        em.persist(category3);




        transaction.commit();
        em.close();
        emf.close();



    }
}