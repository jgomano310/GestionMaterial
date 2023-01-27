package controlador;

import java.util.Calendar;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import implementaciones.AlumnoConsultas;
import implementaciones.PortatilConsultas;


@Controller
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu;
		boolean salir = false;
		Calendar actual = Calendar.getInstance();
		ApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");
		AlumnoConsultas alumnoConsultas = (AlumnoConsultas)contexto.getBean(AlumnoConsultas.class);
		PortatilConsultas portatilConsultas = (PortatilConsultas)contexto.getBean(PortatilConsultas.class);
		
		
		Scanner scan = new Scanner(System.in);
		while(salir) 
		
		System.out.println(" Matrícula alumno");
		System.out.println("Alta de portátil");
		System.out.println("Consulta portátil asignado a un alumno");
		System.out.println("Consulta alumno asignado a un portátil");
		System.out.println("Ver todos los alumnos con su asignación de portátil");
		System.out.println("salir");
		
		
		
		do {
			
			System.out.println("Elija una de las opciones");
			menu= scan.nextInt();
			
			
		switch(menu) {
		case 1:
			System.out.println("A elegido usted matricular alumno");
			
			break;
			
		case 2:
			System.out.println("A elegido usted dar de alta un portátil");
			
			break;
			
		case 3:
			System.out.println("A elegido usted consultar portátil asignado a un alumno");
			
			break;
			
		case 4:
			System.out.println("A elegido usted consultar alumno asignado a un portátil");
			
			break;
			
		case 5:
			System.out.println("A elegido usted ver todos los alumnos con su asignación de portátil");
			break;
			
		case 6:
			System.out.println("Hasta pronto");
			break;
			
		
			
			
		}}while(menu!=6);

	}

}
