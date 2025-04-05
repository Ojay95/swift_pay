package org.swiftpay.service.impl;

import org.swiftpay.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
