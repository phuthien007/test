package springboot.Model.Mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springboot.Entity.ExamResultEntity;
import springboot.Model.DTO.ExamResultDTO;

@Mapper(componentModel = "spring")
public interface ExamResultMapper {

    @Mapping(source = "c.id", target = "classId")
    @Mapping(source = "c.id", target = "studentId")
    ExamResultDTO toDTO(ExamResultEntity e);

    @InheritInverseConfiguration
    ExamResultEntity toEntity(ExamResultDTO d);
}
