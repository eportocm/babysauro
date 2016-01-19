package br.com.babysauro.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.babysauro.modelo.Musica;

public class TestaConexao {

	public static void main(String[] args) {
		
		try {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("babysauro");
			EntityManager entityManager = emf.createEntityManager();
			
			TypedQuery<Musica> query = entityManager.createQuery("from Musica", Musica.class);
			List<Musica> musicas = query.getResultList();
			
			for (Musica m : musicas) 
				System.out.println(m.getIdMusica());
			
		} catch(Exception e){ 
			e.printStackTrace();
		}
	}
}
