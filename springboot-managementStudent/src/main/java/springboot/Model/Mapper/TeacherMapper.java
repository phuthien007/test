package springboot.Model.Mapper;


import org.mapstruct.Mapper;
import springboot.Entity.TeacherEntity;
import springboot.Model.DTO.TeacherDTO;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherDTO toDTO(TeacherEntity e);
    TeacherEntity toEntity(TeacherDTO d);
}
