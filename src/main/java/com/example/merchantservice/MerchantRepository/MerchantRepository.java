package com.example.merchantservice.MerchantRepository;

import com.example.merchantservice.Entity.MerchantEntity;
import org.springframework.data.repository.CrudRepository;

public interface MerchantRepository extends CrudRepository<MerchantEntity,String>
{
//public void findFirstByMerchantIdAndMerchantNameOrderByRatingDesc();
}
