package com.intecap.agenda.controllers;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.repositories.AlumnoRepository;
import com.intecap.agenda.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public ArrayList<Alumno> obtenerAlumnos(){
        return alumnoService.obtenerAlumnos();
    }

    @PostMapping("/alumnos")
    public Alumno guardarAlumno(@RequestBody Alumno alumno){
        // @RequestBody es para que el objeto alumno se cree a partir de los datos que se envian en el body
        return alumnoService.guardarAlumno(alumno);
    }


  
}
