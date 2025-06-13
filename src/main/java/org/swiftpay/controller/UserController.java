package org.swiftpay.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.swiftpay.dto.*;
import org.swiftpay.service.impl.UserService;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;


    @Operation(
            summary = "Create a New Bank Account",
            description = "Creates a new user bank account with initial user details."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Account created successfully",
                    content = @Content(schema = @Schema(implementation = BankResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid user data"),
    })
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Fetches the current balance of a user's account."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Balance fetched successfully",
                    content = @Content(schema = @Schema(implementation = BankResponse.class))),
            @ApiResponse(responseCode = "404", description = "Account not found")
    })
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return  userService.balanceEnquiry(request);
    }

    @Operation(
            summary = "Name Enquiry",
            description = "Fetches the full name of the account holder based on account number."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Name fetched successfully",
                    content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "Account not found")
    })
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return  userService.nameEnquiry(enquiryRequest);
    }

    @Operation(
            summary = "Credit Account",
            description = "Credits the specified amount to a user's account."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Account credited successfully",
                    content = @Content(schema = @Schema(implementation = BankResponse.class))),
            @ApiResponse(responseCode = "404", description = "Account not found")
    })
    @PostMapping("/credit")
    public BankResponse creditAccount (@RequestBody CreditDebitRequest request){
        return  userService.creditAccount(request);
    }

    @Operation(
            summary = "Credit Account",
            description = "Credits the specified amount to a user's account."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Account credited successfully",
                    content = @Content(schema = @Schema(implementation = BankResponse.class))),
            @ApiResponse(responseCode = "404", description = "Account not found")
    })
    @PostMapping("/debit")
    public BankResponse debitAccount (@RequestBody CreditDebitRequest request){
        return  userService.debitAccount(request);
    }

    @Operation(
            summary = "Transfer Funds",
            description = "Transfers a specified amount from one account to another."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Transfer successful",
                    content = @Content(schema = @Schema(implementation = BankResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid transfer details"),
            @ApiResponse(responseCode = "404", description = "Sender or recipient account not found")
    })
    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return  userService.transfer(request);
    }
}