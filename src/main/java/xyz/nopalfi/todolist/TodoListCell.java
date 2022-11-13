package xyz.nopalfi.todolist;

import javafx.scene.control.ListCell;

public class TodoListCell extends ListCell<TodoList> {
    @Override
    protected void updateItem(TodoList todoList, boolean b) {
        super.updateItem(todoList, b);
        String title = null;
        if (title == null || b) {

        } else {
            title = todoList.getTitle();
        }
        this.setText(title);
        setGraphic(null);
    }
}
