package br.com.fiap.resource;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;

@ManagedBean

public class ClienteBean {
	public List<String> completaNomeCliente(String nome) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		ClienteDAOImpl dao = new ClienteDAOImpl(em);
		return dao.buscarPorNomeCliente(nome);

	}

}
