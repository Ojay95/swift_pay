package org.swiftpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.swiftpay.dto.BankResponse;
import org.swiftpay.dto.EnquiryRequest;
import org.swiftpay.dto.UserRequest;
import org.swiftpay.service.impl.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return  userService.balanceEnquiry(request);
    }

    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return  userService.nameEnquiry(enquiryRequest);
    }
}