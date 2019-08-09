package br.com.fiap.resource;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="CLIENTE", sequenceName="SQ_T_CLIENTE" ,allocationSize=1)

public class ClienteTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="CLIENTE",strategy=GenerationType.SEQUENCE)
	@Column
	private int codigo;
	
	@Column
	private String nome;
	

	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public ClienteTO() {
		super();
	}



	public ClienteTO(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	



	
	
	









	
	
}
