package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class HolaAlumnoControlador {

	@RequestMapping("/mustraFormulario") 
	public String mustraFormulario() {
		
		
		return "HolaAlumnosFormulario";
	}
	@RequestMapping("/procesarFormulario") 
	public String procesarFormulario() {
		
		
		return "HolaAlumnosSpring";
	}
	@RequestMapping("/procesarFormulario2") 
  //  public String otroprocesarFormulario(HttpServletRequest req , Model modelo) {
	public String otroprocesarFormulario(@RequestParam("nombreAlumno") String nombre  , Model modelo) {	
	
	nombre+= " es el mejor alumno " ;
	String mensajeFinal = " qui est le meilleur etudiant " + nombre;
	 modelo.addAttribute("mensaje", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
}
