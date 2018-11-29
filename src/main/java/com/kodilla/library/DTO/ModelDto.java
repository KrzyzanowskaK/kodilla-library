package com.kodilla.library.DTO;

public class ModelDto {
    private long id;
    private long bookId;
    private String status;

    public ModelDto(long id, long bookId, String status) {
        this.id = id;
        this.bookId = bookId;
        this.status = status;
    }

    public ModelDto() {
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
