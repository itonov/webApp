package org.softuni.webapp.domain.models.binding;

import org.softuni.webapp.constants.ErrorMessagesBg;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PartEditBindingModel {
    private String name;

    private String description;

    private BigDecimal price;

    private Integer quantity;

    private List<MultipartFile> newPictures;

    private List<String> picturesContentsAsBase64;

    public PartEditBindingModel() {
        this.newPictures = new ArrayList<>();
        this.picturesContentsAsBase64 = new ArrayList<>();
    }

    @NotEmpty(message = ErrorMessagesBg.EMPTY_NAME)
    @Size(min = 2, max = 10, message = ErrorMessagesBg.INVALID_LENGTH)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull(message = ErrorMessagesBg.EMPTY_PRICE)
    @Digits(integer = 4, fraction = 2, message = ErrorMessagesBg.INVALID_PRICE)
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull(message = ErrorMessagesBg.EMPTY_QUANTITY)
    @Min(value = 1L, message = ErrorMessagesBg.INVALID_QUANTITY)
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Size(max = 6)
    public List<MultipartFile> getNewPictures() {
        return this.newPictures;
    }

    public void setNewPictures(List<MultipartFile> newPictures) {
        this.newPictures = newPictures;
    }

    public List<String> getPicturesContentsAsBase64() {
        return this.picturesContentsAsBase64;
    }

    public void setPicturesContentsAsBase64(List<String> picturesContentsAsBase64) {
        this.picturesContentsAsBase64 = picturesContentsAsBase64;
    }
}
