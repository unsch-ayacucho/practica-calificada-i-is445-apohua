package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.Submodulo;

public interface SubmoduloDao {
	
	public List<Submodulo> listarPorPerfil(String usuario);

}
