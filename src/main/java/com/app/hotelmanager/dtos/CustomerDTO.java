package com.app.hotelmanager.dtos;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
}
