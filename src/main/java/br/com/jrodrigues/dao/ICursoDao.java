/**
 * 
 */
package br.com.jrodrigues.dao;

import java.util.List;

import br.com.jrodrigues.domain.Curso;

/**
 * 
 */
public interface ICursoDao {

	public Curso cadastrar(Curso curso);
	
	public Curso buscarPorID(Long id);

	public void excluir(Curso cliente);

	public Curso alterar(Curso cliente);

	public List<Curso> buscarTodos();
}
