package com.adhocsolucoes.padroes_projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhocsolucoes.padroes_projeto.model.Cliente;
import com.adhocsolucoes.padroes_projeto.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos(){
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
		return ResponseEntity.ok(clienteService.buscarPorID(id));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
		clienteService.inserirCliente(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		clienteService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
