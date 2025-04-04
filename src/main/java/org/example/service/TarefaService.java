package org.example.service;

import org.example.dao.TarefaDAO;
import org.example.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaDAO tarefaDAO;

    public void salvar(Tarefa tarefa) {
        tarefaDAO.salvar(tarefa);
    }

    public List<Tarefa> listarPorProjeto(Long projetoId) {
        return tarefaDAO.listarPorProjeto(projetoId);
    }

    public void excluir(Long id) {
        tarefaDAO.excluir(id);
    }
}

