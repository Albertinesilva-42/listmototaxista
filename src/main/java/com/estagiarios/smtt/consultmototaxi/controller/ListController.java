package com.estagiarios.smtt.consultmototaxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estagiarios.smtt.consultmototaxi.repository.NameRepository;


@Controller
@RequestMapping("/nomes/")
public class ListController {

    private final NameRepository nomeRepository;

    @Autowired
    public ListController(NameRepository nomeRepository) {
        this.nomeRepository = nomeRepository;
    }

    @GetMapping("mototaxi")
    public String listNomes(Model model) {
        model.addAttribute("nomes", nomeRepository.findAll());
        return "nomes/lista";
    }

    @GetMapping("home")
    public String capa() {
        return "home/capa";
    }
    
}
