package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Especialidad;
import com.technical.support.datasupport.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    private EspecialidadRepository especialidadRepository;

    @PostMapping("/crear")
    public ResponseEntity crearEspecialidad(@RequestBody Especialidad especialidad){
        especialidadRepository.save(especialidad);
        return new ResponseEntity(HttpStatus.OK);
    }
}
