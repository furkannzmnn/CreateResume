package com.example.resume.Dto.converter;

import com.example.resume.Core.User.User;
import com.example.resume.Dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {
    public UserDto convertToUser(User from){
       return new UserDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getEmail(),
               from.getPassword()
        );
    }
}
