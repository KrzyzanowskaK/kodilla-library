package com.kodilla.library;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "RENTALS")
public class Rental {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private long rentId;

    @Column(name = "USER_ID")
    private long userId;

    @Column(name = "MODEL_ID")
    private long modelId;

    @Column(name = "RENT_DATE")
    private LocalDateTime rentDate;

    @Column(name = "RETURN_DATE")
    private LocalDateTime returnDate;

    public Rental(long userId, long modelId, LocalDateTime rentDate, LocalDateTime returnDate) {
        this.userId = userId;
        this.modelId = modelId;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public Rental() {
    }

    public long getRentId() {
        return rentId;
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

    public void setRentId(long rentId) {
        this.rentId = rentId;
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
