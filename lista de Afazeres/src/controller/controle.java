package controller;

import java.util.List;
import model.Task;
import model.tarefadao;
import view.MainFrame;

public class controle {
    private tarefadao itemdaLista;
    private MainFrame view;
    
    public controle(MainFrame view) { 
        this.itemdaLista = new tarefadao();
        this.view = view;
        this.view.setController(this);
        carregarTarefas();
    }
    
    public void adicionarTarefa(String descricao) {
        Task task = new Task(descricao);
        itemdaLista.addTask(task);
        view.adicionarTarefaNoPainel(task);
    }
    
    public void carregarTarefas() {
        List<Task> tasks = itemdaLista.getAllTasks();
        for (Task task : tasks) {
            view.adicionarTarefaNoPainel(task);
        }
    }
}