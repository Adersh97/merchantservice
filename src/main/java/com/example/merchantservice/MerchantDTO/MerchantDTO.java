package com.example.merchantservice.MerchantDTO;

public class MerchantDTO {
    private String merchantId;
    private String merchantName;
    private String merchantAddress;
    private Integer merchantAge;
    private float rating;
    private Integer userRatingCount;
    private Integer productSold;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public Integer getMerchantAge() {
        return merchantAge;
    }

    public void setMerchantAge(Integer merchantAge) {
        this.merchantAge = merchantAge;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Integer getUserRatingCount() {
        return userRatingCount;
    }

    public void setUserRatingCount(Integer userRatingCount) {
        this.userRatingCount = userRatingCount;
    }

    public Integer getProductSold() {
        return productSold;
    }

    public void setProductSold(Integer productSold) {
        this.productSold = productSold;
    }

    @Override
    public String toString() {
        return "MerchantDTO{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantAddress='" + merchantAddress + '\'' +
                ", merchantAge=" + merchantAge +
                ", rating=" + rating +
                ", userRatingCount=" + userRatingCount +
                ", productSold=" + productSold +
                '}';
    }
}
