package dto;

import java.util.Calendar;

import javax.persistence.Column;

public class AlumnoDTO {

	
	private Calendar md_date;
	
	private String nombre;
	
	private String telefono;

	public AlumnoDTO(Calendar md_date, String nombre, String telefono) {
		super();
		this.md_date = md_date;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public AlumnoDTO() {
		super();
	}

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "AlumnoDTO [md_date=" + md_date + ", nombre=" + nombre + ", teléfono=" + telefono + "]";
	}
	
	
	
}
