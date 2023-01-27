package dto;

import dao.Alumno;
import dao.Portatil;

public interface AdaoServicio {

	
	public Alumno AlumnoDTOaDAO(AlumnoDTO alumnoDTO);
	
	public Portatil PortatilDTOaDAO(PortatilDTO portatilDTO);
}
