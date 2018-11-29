package com.kodilla.library.DTO;

import java.time.LocalDateTime;

public class RentalDto {
    private long userId;
    private long modelId;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;

    public RentalDto(long userId, long modelId, LocalDateTime rentDate, LocalDateTime returnDate) {
        this.userId = userId;
        this.modelId = modelId;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public RentalDto() {
    }

    public long getUserId() {
        return userId;
    }

    public long getModelId() {
        return modelId;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setModelId(long modelId) {
        this.modelId = modelId;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
