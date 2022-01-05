package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.Seller;
import com.example.amazonsystemdesign.Services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/seller")
public class SellerController {

    @Autowired
    private SellerServices sellerServices;

    @PostMapping(value="/addSeller")
    private Boolean addSeller(Seller seller){
        sellerServices.addSeller(seller);
        return true;
    }

    @GetMapping("/getAllSeller")
    public List<Seller> getAllSeller(){
       return sellerServices.getAllSeller();

    }
}
