package xyz.nopalfi.todolist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private Long id;
    private String title;
    private List<String> tags;
    private LocalDateTime localDateTime;
    private String content;
    private String detail;

    public TodoList(Long id, String title, List<String> tags, LocalDateTime localDateTime, String content, String detail) {
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.localDateTime = localDateTime;
        this.content = content;
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
