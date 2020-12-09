
package br.com.locadora.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.locadora.model.Filme;
import br.com.locadora.service.FilmeService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/filme/api")
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@PostMapping("/v1")
	public Filme Salvarv1(@RequestBody Filme filme) {
		this.filmeService.salvar(filme);
		return filme;
	}
	
	@ApiOperation(
			value="Cadastrar um filme novo", 
			response=ResponseEntity.class, 
			notes="Essa operação salva um novo registro com as informações do filme.")
	
	@PostMapping("/v2")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<Filme> salvarv2(@RequestBody Filme filme) {
		return ResponseEntity.ok().body(this.filmeService.salvar(filme));
	}
	
	@GetMapping("/v1")
	public List<Filme> Listar(){
		return this.filmeService.listarProduto();
	}
	
	@GetMapping("/v2")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<List<Filme>> Listarv2() {
		return ResponseEntity.ok().body(this.filmeService.listarProduto());
	}
	
	@DeleteMapping("/v1/{id}")
	public String Remover1(@PathVariable("id") Integer id) {
		this.filmeService.removerProduto(this.filmeService.buscarPorId(id));
		return "Filme informado deletado com sucesso!";
	}
	
	@DeleteMapping("/v2/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Filme> remover2(@PathVariable("id") Integer id){
		return ResponseEntity.ok().body(this.filmeService.buscarPorId(id));	
	}

 	@PutMapping("/{id}")
	public Filme buscarProdutoId(@PathVariable("id") Integer id, @RequestBody Filme filme) {
		Filme filmeBD = this.filmeService.buscarPorId(id);
		BeanUtils.copyProperties(filme, filmeBD, "id");
		this.filmeService.salvar(filmeBD);
		return filmeBD;
	}


}