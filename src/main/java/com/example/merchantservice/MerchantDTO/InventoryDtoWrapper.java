package com.example.merchantservice.MerchantDTO;

import java.util.List;

public class InventoryDtoWrapper {

    private List<InventoryDto> inventoryDtoList;

    @Override
    public String toString() {
        return "InventoryDtoWrapper{" +
                "inventoryDtoList=" + inventoryDtoList +
                '}';
    }

    public List<InventoryDto> getInventoryDtoList() {
        return inventoryDtoList;
    }

    public void setInventoryDtoList(List<InventoryDto> inventoryDtoList) {
        this.inventoryDtoList = inventoryDtoList;
    }
}