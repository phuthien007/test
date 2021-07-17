package springboot.Model.Mapper;

import org.mapstruct.Mapper;
import springboot.Entity.RoleEntity;
import springboot.Model.DTO.RoleDTO;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDTO toDTO(RoleEntity e);
    RoleEntity toEntity(RoleDTO d);
}
