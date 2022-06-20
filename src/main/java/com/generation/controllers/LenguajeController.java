package com.generation.controllers;

import com.generation.models.Lenguaje;
import com.generation.services.LenguajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/lenguaje")
public class LenguajeController {
    @Autowired
    LenguajeService lenguajeService;

    @RequestMapping("")
    public String inicio(@ModelAttribute("lenguaje") Lenguaje lenguaje){

        return "lenguaje.jsp";
    }

    @RequestMapping("/guardar")
    public String guardarIdioma(@Validated @ModelAttribute("lenguaje") Lenguaje lenguaje,
                                BindingResult resultado, Model model) {

        if (resultado.hasErrors()) {
            model.addAttribute("msgError", "Datos erroneos");
            return "lenguaje.jsp";
        }
        else {
            //enviamos el objeto a persistir en base datos
            lenguajeService.guardarLenguaje(lenguaje);
        }
        return "lenguaje.jsp";
    }
}
