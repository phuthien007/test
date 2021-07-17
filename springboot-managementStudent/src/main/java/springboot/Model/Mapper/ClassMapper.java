package springboot.Model.Mapper;

import javassist.ClassMap;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import springboot.Entity.ClassEntity;
import springboot.Model.DTO.ClassDTO;

@Mapper(componentModel = "spring")
public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    @Mapping(source = "course.id", target = "courseId")
    @Mapping(source = "teacher.id", target = "teacherId")
    ClassDTO toDTO(ClassEntity e);

    @InheritInverseConfiguration
    ClassEntity toEntity(ClassDTO d);
}
