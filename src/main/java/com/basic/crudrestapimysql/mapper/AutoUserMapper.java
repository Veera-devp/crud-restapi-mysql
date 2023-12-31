package com.basic.crudrestapimysql.mapper;

import com.basic.crudrestapimysql.dto.UserDto;
import com.basic.crudrestapimysql.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
