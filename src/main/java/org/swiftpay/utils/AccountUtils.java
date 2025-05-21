package org.swiftpay.utils;

import java.time.Year;



public class AccountUtils {


    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";


    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "This user already has an account.";

    public static final String ACCOUNT_CREATION_MESSAGE = "Your account has been created successfully.";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_MESSAGE = "This user already has an account.";

    public static final String ACCOUNT_CREDITED_SUCCESS_CODE = "005";

    public static final String ACCOUNT_DEBITED_SUCCESS_CODE = "006";

    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Your account has been credited successfully.";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "Your account has been debited successfully.";


    public static final String INSUFFICIENT_BALANCE_CODE = "007";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "insufficient balance.";

    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer successful.";




    public static String generateAccountNumber() {
        // 2025 + randomSixDigits

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between min and max

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to strings, then concatenate them

        String year = String.valueOf(currentYear) ;

        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}


