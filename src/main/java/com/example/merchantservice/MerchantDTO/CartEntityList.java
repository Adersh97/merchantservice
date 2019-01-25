package com.example.merchantservice.MerchantDTO;


import com.example.merchantservice.Entity.CartEntity;

import java.util.List;

public class CartEntityList {
    private List<CartEntity> cartEntityList;

    public List<CartEntity> getCartEntityList() {
        return cartEntityList;
    }

    public void setCartEntityList(List<CartEntity> cartEntityList) {
        this.cartEntityList = cartEntityList;
    }
}
