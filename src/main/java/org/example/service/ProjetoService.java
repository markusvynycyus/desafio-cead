package org.example.service;

import org.example.dao.ProjetoDAO;
import org.example.model.Projeto;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoDAO projetoDAO;

    public void salvar(Projeto projeto) {
        projetoDAO.salvar(projeto);
    }

    public Projeto buscarPorId(Long id) {
        return projetoDAO.buscarPorId(id);
    }

    public List<Projeto> listarTodos() {
        return projetoDAO.listarTodos();
    }

    public void excluir(Long id) {
        projetoDAO.excluir(id);
    }
}