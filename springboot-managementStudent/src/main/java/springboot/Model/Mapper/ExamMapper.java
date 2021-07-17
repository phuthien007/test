package springboot.Model.Mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springboot.Entity.ExamEntity;
import springboot.Model.DTO.ExamDTO;

@Mapper(componentModel = "spring")
public interface ExamMapper {


    @Mapping(source = "course.id", target = "courseId")
    ExamDTO toDTO(ExamEntity e);

    @InheritInverseConfiguration
    ExamEntity toEntity(ExamDTO d);
}
