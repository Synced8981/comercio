package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")

public class LojaController {
	
	List<Produto> listadeProdutos = new ArrayList<Produto>();
	
	
	@GetMapping("/listar")
public String listarProdutos(Model model) {
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setDescricao("Maquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("JHDYEJDUSNEU25411");
        p1.setPreco(36534.12);
        
    	Produto p2 = new Produto();
		p2.setId(20l);
		p2.setDescricao("Maquina de Lavar Brastemp 12 litros");
		p2.setCodigoBarras("JHDYEJDUSNEU25411");
        p2.setPreco(36534.12);
		
        listadeProdutos.add(p1);
        listadeProdutos.add(p2);   
        
        model.addAttribute("listadeProdutos", listadeProdutos);
        return "produto";
	 
	}
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}
}
