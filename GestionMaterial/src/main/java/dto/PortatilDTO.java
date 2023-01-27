package dto;

import javax.persistence.Column;

public class PortatilDTO {
	
	
	private String md_date;
	
	private String marca;
	
	private String modelo;

	public String getMd_date() {
		return md_date;
	}

	public void setMd_date(String md_date) {
		this.md_date = md_date;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public PortatilDTO(String md_date, String marca, String modelo) {
		super();
		this.md_date = md_date;
		this.marca = marca;
		this.modelo = modelo;
	}

	public PortatilDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PortatilDTO [md_date=" + md_date + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	

}
