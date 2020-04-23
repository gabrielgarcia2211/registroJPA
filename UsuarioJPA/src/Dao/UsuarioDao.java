package Dao;

import java.util.List;

import Entities.Usuario;

public interface UsuarioDao {

	public Usuario selectById(String usuario);
	
	public List<Usuario> selecAll();
	
	public void insert(Usuario usuario);
	
	public void update(Usuario usuario);
	
	public void delete(Usuario usuario);
	
}
