package com.example.resume.Business;

import com.example.resume.Core.User.User;
import com.example.resume.DataAcces.UserDao;
import com.example.resume.Dto.Requests.UserRequest;
import com.example.resume.Dto.UserDto;
import com.example.resume.Dto.converter.UserDtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserDao userDao;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserDao userDao, UserDtoConverter userDtoConverter) {
        this.userDao = userDao;
        this.userDtoConverter = userDtoConverter;
    }

    public UserDto createUser(UserRequest request){
        User user = new User();
        user.setId(request.getId());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        this.userDao.save(user);
        return userDtoConverter.convertToUser(user);
    }

    protected List<UserDto> getAll(){
        return this.userDao.findAll()
                .stream()
                .map(userDtoConverter::convertToUser)
                .collect(Collectors.toList());
    }
}
