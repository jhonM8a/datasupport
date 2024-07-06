package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Especialidad;
import com.technical.support.datasupport.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/especialidad")
@CrossOrigin(origins = "*")
public class EspecialidadController {
    @Autowired
    private EspecialidadRepository especialidadRepository;

    @PostMapping("/crear")
    public ResponseEntity crearEspecialidad(@RequestBody Especialidad especialidad){
        especialidadRepository.save(especialidad);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Especialidad> getEspecialidades(){
        return especialidadRepository.findAll();
    }

    @GetMapping("/{id}")
    public Especialidad getEspecialidad(@PathVariable Long id){
        Optional<Especialidad> optionalEspecialidad = especialidadRepository.findById(id);
        return optionalEspecialidad.isPresent() ? optionalEspecialidad.get() : null;
    }
}
