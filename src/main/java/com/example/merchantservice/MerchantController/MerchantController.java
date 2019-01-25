package com.example.merchantservice.MerchantController;

import com.example.merchantservice.Entity.MerchantEntity;
import com.example.merchantservice.MerchantDTO.InventoryDto;
import com.example.merchantservice.MerchantDTO.InventoryDtoWrapper;
import com.example.merchantservice.MerchantDTO.MerchantDTO;
import com.example.merchantservice.MerchantService.MerchantService;
import org.json.JSONException;

import org.json.simple.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    MerchantService merchantService;
    @PostMapping("/addMerchant")
    public int addMerchant(@RequestBody MerchantDTO merchantDTO)
    { try {
        System.out.println(merchantDTO.toString());
        MerchantEntity merchantEntity = new MerchantEntity();
        BeanUtils.copyProperties(merchantDTO, merchantEntity);
        merchantService.addMerchant(merchantEntity);
        return HttpServletResponse.SC_OK;

    }catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
        return HttpServletResponse.SC_BAD_REQUEST;

    }


    @GetMapping("/selectMerchant")
    public MerchantEntity getMerchant(@RequestParam String merchantId) throws IOException {
        MerchantEntity merchantEntity=merchantService.getMerchant(merchantId);
        System.out.println(merchantEntity.toString());
        return merchantEntity;
    }

    @PutMapping("/updateMerchant")
    public int updateMerchant(@RequestBody MerchantDTO merchantDTO)
    {
        MerchantEntity merchantEntity = new MerchantEntity();
        BeanUtils.copyProperties(merchantDTO, merchantEntity);
        merchantService.updateMerchant(merchantEntity);
        return HttpServletResponse.SC_OK;
    }

    @DeleteMapping("/deleteMerchant")
    public int deleteMerchant(@RequestParam String merchantId)
    {
        merchantService.deleteMerchant(merchantId);
        return HttpServletResponse.SC_OK;

    }

//    @PutMapping("/updateRating")
//    public String updateRating(String merchantId,float rating)
//    {
//      MerchantEntity merchantEntity=merchantService.getMerchant(merchantId);
//      rating= (rating + merchantEntity.getRating()*merchantEntity.getUserRatingCount())/merchantEntity.getUserRatingCount()+1;
//      merchantEntity.setRating(rating);
//      merchantEntity.setUserRatingCount(merchantEntity.getUserRatingCount()+1);
//      merchantService.updateMerchant(merchantEntity);
//        return "Rating Updated";
//    }



    @RequestMapping(value="/updateProductSold", method=RequestMethod.POST)
    public JSONObject updateProductSold(@RequestBody List<String> merchantIdList) throws JSONException {

        JSONObject jsonObject= new JSONObject();
        try {
        System.out.println(merchantIdList.toString());
        for (String merchantId : merchantIdList) {
            MerchantEntity merchantEntity = merchantService.getMerchant(merchantId);
            merchantEntity.setProductSold(merchantEntity.getProductSold() + 1);
            merchantService.updateMerchant(merchantEntity);
        }
        jsonObject.put("status","true");
        jsonObject.put("msg","Product Incremented");
    }catch (Exception e){
        jsonObject.put("status",false);
        jsonObject.put("msg","Product Incrementing failed");


        }
        System.out.println(jsonObject);
     return jsonObject;
    }



    @RequestMapping(value="/getMerchantName",method=RequestMethod.POST)
    public InventoryDtoWrapper getMerchantName(@RequestBody List<InventoryDto> inventoryDtoList)
    {
        for(int i=0;i<inventoryDtoList.size();i++)
        {
            inventoryDtoList.get(i).setMerchantName(merchantService.getMerchant(inventoryDtoList.get(i).getMerchantId()).getMerchantName());
        }
        InventoryDtoWrapper inventoryDtoWrapper=new InventoryDtoWrapper();
        inventoryDtoWrapper.setInventoryDtoList(inventoryDtoList);
        return inventoryDtoWrapper;
    }


}
