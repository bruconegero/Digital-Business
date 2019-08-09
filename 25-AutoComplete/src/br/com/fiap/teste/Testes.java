package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.resource.ClienteTO;

public class Testes {
	
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica =  Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		 EntityManager em = fabrica.createEntityManager();
		
		ClienteTO a = new ClienteTO();
		a.setNome("Josueh das Pazes");
		
		ClienteTO b = new ClienteTO();
		a.setNome("Joaum das Claras");
		
		ClienteTO c = new ClienteTO();
		a.setNome("Josueh das Pazes");
		
	
		
		ClienteDAO dao = new ClienteDAOImpl(em);
		dao.cadastrar(a);
		dao.cadastrar(b);
		dao.cadastrar(c);
	
		try {
			dao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
