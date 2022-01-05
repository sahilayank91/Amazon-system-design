package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.Seller;
import com.example.amazonsystemdesign.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServices {

    @Autowired
    private SellerRepository sellerRepository;

    public boolean addSeller(Seller seller){
        sellerRepository.save(seller);
        return true;
    }
}
