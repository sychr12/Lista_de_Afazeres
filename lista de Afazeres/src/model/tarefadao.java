package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class tarefadao {//colocar no banco SQLite
    public static final String URL = "jdbc:sqlite:tasks.db";
    
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS tasks(" + 
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
                     "description TEXT NOT NULL, " +
                     "completed BOOLEAN NOT NULL)";
        
        try(Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (description, completed) VALUES (?,?)";
        try(Connection conn = DriverManager.getConnection(URL);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, task.getDescription());
            pstmt.setBoolean(2, task.isCompleted());
            pstmt.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";
        try(Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()) {
                Task task = new Task(rs.getString("description"));
                task.setId(rs.getInt("id"));
                task.setCompleted(rs.getBoolean("completed"));
                tasks.add(task);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
