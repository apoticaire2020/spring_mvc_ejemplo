package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/secondario")
public class TirarControlador {

	@RequestMapping("/mustraFormulario") 
	public String mustraFormulario() {
		
		
		return "HolaAlumnosFormulario";
	}
	@RequestMapping("/procesarFormulario2") 
	  //  public String otroprocesarFormulario(HttpServletRequest req , Model modelo) {
		public String otroprocesarFormulario(@RequestParam("nombreAlumno") String nombre  , Model modelo) {	
		
		nombre+= " es el peor alumno " ;
		String mensajeFinal = " qui est le mauvais etudiant " + nombre;
		 modelo.addAttribute("mensaje", mensajeFinal);
			
			return "HolaAlumnosSpring";
		}
}
