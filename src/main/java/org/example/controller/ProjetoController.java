package org.example.controller;

import org.example.model.Projeto;
import org.example.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProjetoController {

    private Projeto projeto = new Projeto();
    private List<Projeto> projetos;

    @Autowired
    private ProjetoService projetoService;

    /*@PostConstruct
    public void init() {
        projetos = projetoService.listarTodos();
    }*/

    public void salvar() {
        projetoService.salvar(projeto);
        projeto = new Projeto();
        projetos = projetoService.listarTodos();
    }

    public void excluir(Long id) {
        projetoService.excluir(id);
        projetos = projetoService.listarTodos();
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

}
