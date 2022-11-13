module xyz.nopalfi.todolist {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens xyz.nopalfi.todolist to javafx.fxml;
    exports xyz.nopalfi.todolist;
}