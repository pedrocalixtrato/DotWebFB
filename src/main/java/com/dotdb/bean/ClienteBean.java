package com.dotdb.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import com.dotdb.dao.ClienteDAO;
import com.dotdb.domain.Clientes;

@SuppressWarnings("serial")
@Named
@javax.faces.view.ViewScoped
public class ClienteBean implements Serializable{
	
	
	private Clientes clientes;
	@Inject
	private ClienteDAO clienteDAO;
	
	
	@PostConstruct
	public void init(){
		
		clientes = new Clientes();
		
	}
	
	public void salvar(){
		
		try{			
			clienteDAO.salvar(clientes);
						
			Messages.addGlobalInfo("Salvo com sucesso!");
		}catch(RuntimeException e){
			Messages.addGlobalError("Erro ao salvar este cadastro");
			e.printStackTrace();
		}
		
		
	}




	public Clientes getClientes() {
		return clientes;
	}




	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	

}
