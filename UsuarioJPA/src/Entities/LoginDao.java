package Entities;

import Dao.HibernateUsuarioDao;
import Dao.UsuarioDao;

public class LoginDao {

	public String authenticateUser(Usuario usuario) {
		
		UsuarioDao usuarioDao = new HibernateUsuarioDao();
		
		Usuario u = usuarioDao.selectById(usuario.getUsuario());
		
		if(u!=null){
			if(u.getClave().contentEquals(usuario.getClave())){
				return "succes";
			}
		}
		return "error";
	}
	
}
