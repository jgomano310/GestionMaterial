package dto;

import java.util.Calendar;

import dao.Alumno;
import dao.Portatil;

public class AdtoServicioIMPL implements AdtoServicio {

	@Override
	public AlumnoDTO AlumnoDAOaDTO(Calendar md_date, String nombre, String telefono) {
		AlumnoDTO alumnoDTO= new AlumnoDTO( md_date,  nombre,  telefono);
		
		return alumnoDTO;
	}

	@Override
	public PortatilDTO PortatilDAOaDTO(String md_date, String marca, String modelo) {
		PortatilDTO portatilDTO = new PortatilDTO( md_date,  marca,  modelo);
		
		return portatilDTO;
	}

	




}
