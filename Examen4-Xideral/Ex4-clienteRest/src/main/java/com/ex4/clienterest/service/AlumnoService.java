package com.ex4.clienterest.service;

import java.util.List;

import com.ex4.clienterest.entity.Alumno;

public interface AlumnoService {

	public List<Alumno> getAlumnos();

	public void saveAlumno(Alumno _alumno);

	public Alumno getAlumno(int theId);

	public void deleteAlumno(int theId);
	
}
