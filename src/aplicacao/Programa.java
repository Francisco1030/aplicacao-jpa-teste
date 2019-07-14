package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.Pessoa;

public class Programa {

	public static void main(String[] args) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploJPA");
		EntityManager em = emf.createEntityManager();

		/*
		 * Cadastrar Pessoa p1 = new Pessoa(null, "João", "joao@gmail.com"); Pessoa p2 =
		 * new Pessoa(null, "João Marcelo", "joao_marcelo@gmail.com"); Pessoa p3 = new
		 * Pessoa(null, "Gustavo", "gustavo@gmail.com");
		 * 
		 * em.getTransaction().begin(); em.persist(p1); em.persist(p2); em.persist(p3);
		 * em.getTransaction().commit();
		 */

		/*
		 * Buscar por id Pessoa p = em.find(Pessoa.class, 3); System.out.println(p);
		 * JOptionPane.showMessageDialog(null, p);
		 */

		/*
		 * Remover Pessoa p = em.find(Pessoa.class, 1);
		 * 
		 * em.getTransaction().begin(); em.remove(p); em.getTransaction().commit();
		 * System.out.println(p.getNome() + " foi removido do banco de dados.");
		 */

		/*Atualizar
		 * Pessoa p = em.find(Pessoa.class, 2); p.setNome("Franciso");
		 * p.setEmail("francisco@gmail.com");
		 * 
		 * em.getTransaction().begin(); em.persist(p);; em.getTransaction().commit();
		 * System.out.println(p.getNome() + " foi atualizado do banco de dados.");
		 */
		
		em.close();
		emf.close();
	}

}
