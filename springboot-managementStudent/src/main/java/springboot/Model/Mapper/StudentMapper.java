package springboot.Model.Mapper;

import org.mapstruct.Mapper;
import springboot.Entity.StudentEntity;
import springboot.Model.DTO.StudentDTO;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDTO toDTO(StudentEntity e);
    StudentEntity toEntity(StudentDTO d);
}
