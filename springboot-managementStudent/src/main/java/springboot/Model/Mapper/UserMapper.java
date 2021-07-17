package springboot.Model.Mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springboot.Entity.UserEntity;
import springboot.Model.DTO.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "role.roleName", target = "roleName")
    UserDTO toDTO(UserEntity e);

    @InheritInverseConfiguration
    UserEntity toEntity(UserDTO d);
}
