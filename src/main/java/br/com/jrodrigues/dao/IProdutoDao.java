package br.com.jrodrigues.dao;

import java.util.List;

import br.com.jrodrigues.domain.Produto;

public interface IProdutoDao {
	
	public Produto cadastrar(Produto produto);
	
	public Produto buscarPorID(Long id);

	public void excluir(Produto produto);

	public Produto alterar(Produto produto);

	public List<Produto> buscarTodos();

}
