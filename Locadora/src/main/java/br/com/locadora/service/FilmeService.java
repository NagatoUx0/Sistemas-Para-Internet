
package br.com.locadora.service;

import java.util.List;

import br.com.locadora.model.Filme;

public interface FilmeService {

	Filme salvar(Filme produto);
	List<Filme> listarProduto();
	void removerProduto(Filme produto);
	void removerPorId(int idProduto);
	Filme buscarPorId(int idProduto);

}