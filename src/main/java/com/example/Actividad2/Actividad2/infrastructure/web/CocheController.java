package com.example.Actividad2.Actividad2.infrastructure.web;

import com.example.Actividad2.Actividad2.application.CochesUseCases;
import com.example.Actividad2.Actividad2.domain.Coche;
import com.example.Actividad2.Actividad2.domain.CochesRepository;
import com.example.Actividad2.Actividad2.infrastructure.data.CochesRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
//
@Controller
public class CocheController {

    CochesUseCases cochesUseCases;

    public CocheController(){
        this.cochesUseCases = new CochesUseCases(new CochesRepositoryRAM());

    }
    @GetMapping("/")
    String index(Model model){
        List<Coche> coches = this.cochesUseCases.getAll();
        model.addAttribute("coches",coches);
        return "index";
    }
    @PostMapping("/nuevo")
    String inico(Model model, String matricula, String marca, String modelo, Integer km){
        List<Coche> coches = this.cochesUseCases.getAll();
        this.cochesUseCases.addCoche(new Coche(matricula,marca,modelo,km));
        model.addAttribute("coches",coches);
        return "index";
    }

    @RequestMapping("/form")
    String form(Model model){
        return "form";
    }

    @PostMapping("/buscar")
    String buscar(Model model, String busqueda){
        List<Coche> coches = this.cochesUseCases.getAll();
        Coche encontrado;
        for (Coche c : coches){
            if (c.getMatricula().equals(busqueda)){
                encontrado = new Coche(c.getMatricula(),c.getMarca(),c.getModelo(),c.getKm());
                model.addAttribute("coche",encontrado);
            }
        }
        return "busqueda";
    }


}
