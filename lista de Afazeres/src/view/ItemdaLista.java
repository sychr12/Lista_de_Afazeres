package view;

import javax.swing.*;
import model.Task;

public class ItemdaLista extends JPanel {
    private JCheckBox checkBox;
    private JButton deleteButton;
    
    public ItemdaLista(Task task) {
        checkBox = new JCheckBox(task.getDescription());
        checkBox.setSelected(task.isCompleted());
        
        deleteButton = new JButton("X");
        
        add(checkBox);
        add(deleteButton);
    }
}