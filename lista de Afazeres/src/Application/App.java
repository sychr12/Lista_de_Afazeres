package Application;

import javax.swing.SwingUtilities;
import controller.controle; 
import view.MainFrame;
import model.tarefadao;

public class App {
    public static void main(String[] args) {
        tarefadao.createTable();
        SwingUtilities.invokeLater(() -> {
            MainFrame view = new MainFrame();
            new controle(view);  
            view.setVisible(true);
        });
    }
}