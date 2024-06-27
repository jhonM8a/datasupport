package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Contrato;
import com.technical.support.datasupport.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import
        org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private ContratoRepository contratoRepository;

    @PostMapping("/crear")
    public ResponseEntity crearContrarto(@RequestBody Contrato contrato){

        contratoRepository.save(contrato);
        ResponseEntity responseEntity;
        if(contratoRepository.existsById(contrato.getId_contrato())){
            responseEntity = new ResponseEntity(HttpStatus.OK);
        }else{
            responseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  responseEntity;
    }
}
