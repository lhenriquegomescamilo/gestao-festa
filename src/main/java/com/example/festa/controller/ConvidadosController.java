package com.example.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.festa.model.entity.Convidado;
import com.example.festa.model.service.ConvidadoService;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private ConvidadoService service;
	

	@RequestMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", service.findAll());
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Convidado convidado) {
		System.out.println(convidado);
		service.save(convidado);
		return "redirect:/convidados";
	}
}
