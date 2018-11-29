package com.kodilla.library;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "MODEL")
public class Model {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private long id;

    @Column(name = "BOOK_ID")
    private long bookId;

    @Column(name = "STATUS")
    private String status;

    public Model(long bookId) {
        this.bookId = bookId;
        this.status = String.format("Book added to library: ", LocalDateTime.now().toString());
    }

    public Model() {
    }

    public long getId() {
        return id;
    }

    public long getBookId() {
        return bookId;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
