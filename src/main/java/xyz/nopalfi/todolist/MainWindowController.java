package xyz.nopalfi.todolist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML
    private Label lblJudul;

    @FXML
    private Label lblTags;

    @FXML
    private Label lblDateTime;

    @FXML
    private ListView<TodoList> lstTodo;

    @FXML
    private TextArea txtArea;

    private final ObservableList<TodoList> todoList = FXCollections.observableArrayList();

    public void setTodoList() {
        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("Asia/Makassar"));
        todoList.add(new TodoList(1L, "Belajar Java", Arrays.asList("Programming","Java"), now1, "Pelajari cara belajar bahasa pemrograman Java", "Referensi: https://roadmap.sh/java"));
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Asia/Makassar"));
        todoList.add(new TodoList(2L, "Belajar BackEnd", Arrays.asList("BackEnd","Java"), now2, "Pelajari cara menjadi seorang BackEnd Developer", "Referensi: https://roadmap.sh/backend"));
        lstTodo.getItems().addAll(todoList);
    }

    @FXML
    public void onTodoListClick(MouseEvent e) {
        txtArea.setText(lstTodo.getSelectionModel().getSelectedItem().getContent());
        lblJudul.setText("Judul: "+lstTodo.getSelectionModel().getSelectedItem().getTitle());
        lblTags.setText("Tags: "+lstTodo.getSelectionModel().getSelectedItem().getTags().toString());
        lblDateTime.setText(lstTodo.getSelectionModel().getSelectedItem().getLocalDateTime().format(DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy - H:m:ss")));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setTodoList();
    }
}
