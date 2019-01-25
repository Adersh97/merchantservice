package com.example.merchantservice.MerchantDTO;

public class InventoryDto {

    private String inventoryId;

    private String merchantId;
    private String productId;
    private Double price;
    private int stock;
    private String imageUrl;
    private String name;
    private Double productRating;
    private int ratingCount;
    private int soldItems;
    private String merchantName;
    private String description;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Double getProductRating() {
        return productRating;
    }

    public void setProductRating(Double productRating) {
        this.productRating = productRating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(int soldItems) {
        this.soldItems = soldItems;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "inventoryId='" + inventoryId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", productRating=" + productRating +
                ", ratingCount=" + ratingCount +
                ", soldItems=" + soldItems +
                ", merchantName='" + merchantName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

