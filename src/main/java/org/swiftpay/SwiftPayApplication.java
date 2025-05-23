package org.swiftpay;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Swift Pay Bank Application",
                description = "Backend Rest API for swift bank_application",
                version = "v1.0",
                contact = @Contact(
                        name= "Ojo Akinsola",
                        email="iamojay89@gmail.com",
                        url= "https://github.com/ojay95/swift_pay"
                ),
                license = @License(
                        name = "Swift Pay",
                        url = "https://github.com/ojay95/swift_pay"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = " Backend Rest API for swift bank_application",
                url = "https://github.com/ojay95/swift_pay"
        )
)
public class SwiftPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwiftPayApplication.class, args);
    }

}
