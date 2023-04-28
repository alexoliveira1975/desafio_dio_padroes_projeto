package com.adhocsolucoes.padroes_projeto.service;

import com.adhocsolucoes.padroes_projeto.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorID(Long id);
	
	void inserirCliente(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

}
