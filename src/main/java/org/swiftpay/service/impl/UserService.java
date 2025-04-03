package org.swiftpay.service.impl;

import org.swiftpay.dto.BankResponse;
import org.swiftpay.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
