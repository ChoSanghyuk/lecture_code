package org.example;

import org.example.entity.Category;
import org.example.entity.Item;
import org.example.entity.Member;
import org.example.entity.item.Album;
import org.example.entity.item.Movie;

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

        Album album = new Album();
        album.setArtist("me");


        Movie movie = new Movie();
        movie.setActor("me");
        movie.setDirector("me");


        em.persist(album);
        em.persist(movie);

        transaction.commit();
        em.close();
        emf.close();



    }
}