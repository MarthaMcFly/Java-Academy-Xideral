package com.ex4.clienterest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ex4.clienterest.entity.Alumno;
import com.ex4.clienterest.service.AlumnoService;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	// need to inject our customer service
		@Autowired
		private AlumnoService alumnoService;
		
		@GetMapping("/list")
		public String listAlumnos(Model theModel) {
			
			// get customers from the service
			List<Alumno> listaAlumnos = alumnoService.getAlumnos();
					
			// add the customers to the model
			theModel.addAttribute("alumnos", listaAlumnos);
			
			return "list-alumnos";    //regresa al jsp list-alumnos
		}
		
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			
			// create model attribute to bind form data
			Alumno _alumno = new Alumno();
			
			theModel.addAttribute("alumno", _alumno);
			
			return "alumno-form"; //va al jsp alumno-form
		}
		
		@PostMapping("/saveAlumno")
		public String saveAlumno(@ModelAttribute("alumno") Alumno _alumno) {
						
			// save the customer using our service
			alumnoService.saveAlumno(_alumno);	
			
			return "redirect:/alumno/list";  
		}
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("alumnoId") int theId,
										Model theModel) {
			
			// get the customer from our service
			Alumno _alumno = alumnoService.getAlumno(theId);	
			
			// set customer as a model attribute to pre-populate the form
			theModel.addAttribute("alumno", _alumno);
			
			// send over to our form		
			return "alumno-form";  //va al jsp alumno-form
		}
		
		@GetMapping("/delete")
		public String deleteAlumno(@RequestParam("alumnoId") int theId) { //recibe parametro del jsp
			
			// delete the customer
			alumnoService.deleteAlumno(theId);
			
			return "redirect:/alumno/list";   
		}
}










