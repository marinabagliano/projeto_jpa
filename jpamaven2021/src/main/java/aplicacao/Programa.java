package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		

		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		
		Pessoa p1 = em.find(Pessoa.class, 1);
		Pessoa p2 = em.find(Pessoa.class, 2);
		Pessoa p3 = em.find(Pessoa.class, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("Finish!");
		em.close();
		enf.close();
		
		
	}

}
