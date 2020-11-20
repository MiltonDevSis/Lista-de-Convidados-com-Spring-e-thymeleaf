package com.senai.convidados.convidados.controller;

import com.senai.convidados.convidados.repository.ConvidadosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {

    @Autowired
    private ConvidadosRepository convidadosRepository;

    @RequestMapping("/convidados")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("ListaConvidados");
        mv.addObject("convidadosmv", convidadosRepository.todos());

        return mv;
    }    
}
