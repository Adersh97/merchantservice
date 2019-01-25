package com.example.merchantservice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name=CartEntity.TABLE_NAME)
public class CartEntity implements Serializable {
    public static final String TABLE_NAME="Cart";
    public static final String ID_COLUMN="CARTID";
    @Id
    @Column(name=CartEntity.ID_COLUMN)
    private String cartId;
    private String token;
    private String productId;
    private String merchantId;
    private Integer quantity;

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartEntity{" +
                "cartId='" + cartId + '\'' +
                ", token='" + token + '\'' +
                ", productId='" + productId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
