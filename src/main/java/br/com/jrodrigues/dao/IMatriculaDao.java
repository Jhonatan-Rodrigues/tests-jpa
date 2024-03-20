package br.com.jrodrigues.dao;

import java.util.List;

import br.com.jrodrigues.domain.Matricula;

public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);
	
	public Matricula buscarPorID(Long id);

	public void excluir(Matricula mat);

	public Matricula alterar(Matricula mat);

	public List<Matricula> buscarTodos();

}
