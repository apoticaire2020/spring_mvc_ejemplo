package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoControlador {

	
	@RequestMapping("/mustraFormulario") 
	public String mustraFormulario(Model modelo) {
		
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		
		return "alumnoRegistoFormulario";
		
	}
	@RequestMapping("/procesarFormulario")
	public String processarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		
		return "confirmacionRegistroAlumno";
	}
}
