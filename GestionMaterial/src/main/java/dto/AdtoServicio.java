package dto;

import java.util.Calendar;

import dao.Alumno;
import dao.Portatil;

public interface AdtoServicio {
	
	public AlumnoDTO AlumnoDAOaDTO (Calendar md_date, String nombre, String telefono);
	
	
	
	
	
	public PortatilDTO PortatilDAOaDTO( String md_date,String marca,String modelo);
	
	

	
}
