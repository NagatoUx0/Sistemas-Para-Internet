
package br.com.locadora.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.exception.EntidadeNãoEncontradaException;
import br.com.locadora.model.Filme;
import br.com.locadora.repository.FilmeRepository;



@Service
public class FilmeServiceImpl implements FilmeService{

	@Autowired
	private FilmeRepository FilmeRepository;

	@Override
	@Transactional
	public Filme salvar(Filme filme) {
		return this.FilmeRepository.save(filme);
		
	}

	@Override
	public List<Filme> listarProduto() {
		return this.FilmeRepository.findAll();
	}

	@Transactional
	public void removerFilme(Filme filme) {
		this.FilmeRepository.delete(filme);
		
	}

	@Override
	@Transactional
	public void removerPorId(int idFilme) {
		this.FilmeRepository.deleteById(idFilme);
		
	}

	@Override
	public Filme buscarPorId(int idFilme) {
		Optional<Filme> filme = this.FilmeRepository.findById(idFilme);
		if(filme.get()==null) {
			throw new EntidadeNãoEncontradaException("Não foi possível localizar o filme pesquisado!");
		} else
		return filme.get();
	}

	@Override
	public void removerProduto(Filme produto) {
		// TODO Auto-generated method stub
		
	}

}