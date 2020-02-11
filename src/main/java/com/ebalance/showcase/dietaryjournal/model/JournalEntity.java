package com.ebalance.showcase.dietaryjournal.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "journal")
@XmlAccessorType(XmlAccessType.FIELD)
    public class JournalEntity {

    private Integer mealId;
    private Integer userId;
    private String foodName;
    private Integer foodAmountGram;
    private LocalDateTime timestamp;

    @Override
    public String toString() {
        return "JournalEntity{" +
                "mealId=" + mealId +
                ", userId=" + userId +
                ", foodName='" + foodName + '\'' +
                ", foodAmountGram=" + foodAmountGram +
                ", timestamp=" + timestamp +
                '}';
    }

    public JournalEntity() {
    }

    public JournalEntity(Integer mealId, Integer userId, String foodName, Integer foodAmountGram, LocalDateTime timestamp) {
        this.mealId = mealId;
        this.userId = userId;
        this.foodName = foodName;
        this.foodAmountGram = foodAmountGram;
        this.timestamp = timestamp;
    }

    public Integer getMealId() {
        return mealId;
    }

    public void setMealId(Integer mealId) {
        this.mealId = mealId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodAmountGram() {
        return foodAmountGram;
    }

    public void setFoodAmountGram(Integer foodAmountGram) {
        this.foodAmountGram = foodAmountGram;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
