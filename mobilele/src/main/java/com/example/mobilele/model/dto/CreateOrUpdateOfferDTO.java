package com.example.mobilele.model.dto;

import com.example.mobilele.model.enums.EngineEnum;
import com.example.mobilele.model.enums.TransmissionEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CreateOrUpdateOfferDTO {

    @NotNull
    @Min(1)
    private Long modelId;
    @NotNull
    private EngineEnum engine;
    @Positive
    @NotNull
    private Integer price;
    @Positive
    @NotNull
    private Integer mileage;
    @Min(1900)
    @NotNull
    private Integer year;

    @NotEmpty
    private String description;

    @NotNull
    private TransmissionEnum transmission;
    @NotEmpty
    private String imageUrl;


    public Long getModelId() {
        return modelId;
    }

    public CreateOrUpdateOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public CreateOrUpdateOfferDTO setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public CreateOrUpdateOfferDTO setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public CreateOrUpdateOfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public CreateOrUpdateOfferDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateOrUpdateOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public CreateOrUpdateOfferDTO setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CreateOrUpdateOfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
