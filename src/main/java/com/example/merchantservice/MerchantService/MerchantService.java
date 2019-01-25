package com.example.merchantservice.MerchantService;

import com.example.merchantservice.Entity.MerchantEntity;

public interface MerchantService {


    public int addMerchant(MerchantEntity merchantEntity);
    public MerchantEntity getMerchant(String merchantId);
    public int updateMerchant(MerchantEntity merchantEntity);
    public  void deleteMerchant(String merchantId);

}
