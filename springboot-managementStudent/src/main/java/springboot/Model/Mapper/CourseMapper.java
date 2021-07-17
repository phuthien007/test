package springboot.Model.Mapper;

import org.mapstruct.Mapper;
import springboot.Entity.CourseEntity;
import springboot.Model.DTO.CourseDTO;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseDTO toDTO(CourseEntity e);
    CourseEntity toEntity(CourseDTO d);
}
