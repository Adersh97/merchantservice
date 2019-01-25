package com.example.merchantservice.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name= MerchantEntity.TABLE_NAME)
public class MerchantEntity implements Serializable{
        public static final String TABLE_NAME ="Merchant";
        public static final String ID_COLUMN="ID";
        @Id
        private String merchantId;
        private String merchantName;
        private String merchantAddress;
        private Integer merchantAge;
        private float rating;
        private Integer userRatingCount;
        private Integer productSold;

    public Integer getUserRatingCount() {
        return userRatingCount;
    }

    public void setUserRatingCount(Integer userRatingCount) {
        this.userRatingCount = userRatingCount;
    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

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

    public Integer getProductSold() {
        return productSold;
    }

    public void setProductSold(Integer productSold) {
        this.productSold = productSold;
    }

    @Override
    public String toString() {
        return "MerchantEntity{" +
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
