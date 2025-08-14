package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import model.Task;
import controller.controle;

public class MainFrame extends JFrame {
    private JTextField taskInput;
    private JButton addButton;
    private JPanel tasksPanel;
    private controle controller;
    
    public MainFrame() {
        setTitle("Task Manager");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Input panel
        JPanel inputPanel = new JPanel();
        taskInput = new JTextField(20);
        addButton = new JButton("Add");
        inputPanel.add(taskInput);
        inputPanel.add(addButton);
        
        // Tasks panel
        tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));
        
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(tasksPanel), BorderLayout.CENTER);
        
        // Add button functionality
        addButton.addActionListener((ActionEvent e) -> {
            String description = taskInput.getText();
            if(!description.isEmpty()) {
                controller.adicionarTarefa(description); 
                taskInput.setText("");
            }
        });
    }
    
    public void setController(controle controller) { 
        this.controller = controller;
    }
    
    public void adicionarTarefaNoPainel(Task task) { 
        ItemdaLista taskPanel = new ItemdaLista(task);
        tasksPanel.add(taskPanel);
        tasksPanel.revalidate();
    }
}
