
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

import br.com.locadora.model.Categoria;
import br.com.locadora.repository.CategoriaRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categorias/api")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/v1")
	public List<Categoria> listarv1() {
		return this.repository.findAll();	
	}
	
	@GetMapping("/v2")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<List<Categoria>> Listarv2() {
		return ResponseEntity.ok().body(this.repository.findAll());
	}
	
	@PutMapping("/{id}")
	public Categoria editar(@PathVariable("id") Integer id, @RequestBody Categoria categoria) {
		Categoria categoriaDoBancoDeDados = this.repository.findById(id).get();
		BeanUtils.copyProperties(categoria, categoriaDoBancoDeDados, "id");
		this.repository.save(categoriaDoBancoDeDados);
		return categoriaDoBancoDeDados;
	}
	
	@DeleteMapping("/v1/{id}")
	public void remover1(@PathVariable("id") Integer id) {
		this.repository.deleteById(id);
	}
	
	
	@PostMapping("/v1")
	public Categoria salvarv1(@RequestBody Categoria categoria) {
		return this.repository.save(categoria);
	}
	
	@ApiOperation(
			value="Cadastrar uma nova categoria", 
			response=ResponseEntity.class, 
			notes="Essa operação salva um novo registro com as informações da categoria.")
	
	@PostMapping("/v2")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<Categoria> salvarv2(@RequestBody Categoria categoria) {
		return ResponseEntity.ok().body(this.repository.save(categoria));
	}
	
}
