package com.basic.crudrestapimysql.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    private String firstName;
    private String LastName;
    private String email;
}
