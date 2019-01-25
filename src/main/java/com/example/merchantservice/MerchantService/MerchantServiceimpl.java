package com.example.merchantservice.MerchantService;

import com.example.merchantservice.Entity.MerchantEntity;
import com.example.merchantservice.MerchantRepository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class MerchantServiceimpl implements MerchantService{
    @Autowired
    MerchantRepository merchantRepository ;

    @Override
    @Transactional(readOnly = false)
    public int addMerchant(MerchantEntity merchantEntity) {
        merchantRepository.save(merchantEntity);
        return HttpServletResponse.SC_OK;


    }

    @Override
    public MerchantEntity getMerchant(String merchantId) {
         MerchantEntity merchantEntity=merchantRepository.findOne(merchantId);
         return merchantEntity;
     }

    @Override
    public int updateMerchant(MerchantEntity merchantEntity) {
        merchantRepository.save(merchantEntity);
        return HttpServletResponse.SC_OK;

    }

    @Override
    public void deleteMerchant(String merchantId)
    {
        merchantRepository.delete(merchantId);

    }
}
