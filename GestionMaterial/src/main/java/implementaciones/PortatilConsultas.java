package implementaciones;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Portatil;
import dao.PortatilImpl;

@Service
public class PortatilConsultas {
	
	@Autowired
	private PortatilImpl p;

	public void Insertar(Portatil portatil) {
		// TODO Auto-generated method stub
		p.Insertar(portatil);
		
		
	}

	
	
	public List<Portatil> listarPortatil() {
		// TODO Auto-generated method stub
		return p.listarPortatil();
	}
	
}
