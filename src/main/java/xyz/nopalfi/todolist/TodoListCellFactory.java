package xyz.nopalfi.todolist;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class TodoListCellFactory implements Callback<ListView<TodoList>, ListCell<TodoList>> {


    @Override
    public ListCell<TodoList> call(ListView<TodoList> todoListListView) {
        return new TodoListCell();
    }
}
