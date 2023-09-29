package com.example.Actividad2.Actividad2.Controller;

import com.example.Actividad2.Actividad2.Logica.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CocheController {

    List<Coche> coches = cargarlista();
    public List<Coche> cargarlista(){
        List<Coche> lista = new ArrayList<>();
        lista.add(new Coche("4387JXM","Seat","Leon",432354));
        lista.add(new Coche("3454DKL","Ford","Mondeo",4));
        lista.add(new Coche("1089LXF","Volkswagen","Passat",65443));


        return lista;
    }
    @GetMapping("/")
    String index(Model model){
        model.addAttribute("coches",coches);
        return "index";
    }
    @PostMapping("/coches")
    String inico(Model model, String matricula, String marca, String modelo, Integer km){
        coches.add(new Coche(matricula,marca,modelo,km));
        model.addAttribute("coches",coches);
        return "index";
    }

    @RequestMapping("/form")
    String form(Model model){
        return "form";
    }


}
