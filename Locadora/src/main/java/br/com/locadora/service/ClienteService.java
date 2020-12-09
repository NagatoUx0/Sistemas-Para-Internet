
package br.com.locadora.service;

import java.util.List;

import br.com.locadora.model.Cliente;

public interface ClienteService {
	
	Cliente Salvar(Cliente cliente);
	List<Cliente> listaClientes();
	void remover(Cliente cliente);
	Cliente buscarPorId(int idCliente);
	

}
