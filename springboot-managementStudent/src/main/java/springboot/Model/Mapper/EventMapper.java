package springboot.Model.Mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springboot.Entity.EventEntity;
import springboot.Model.DTO.EventDTO;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mapping(source = "c.id", target = "classId")
    EventDTO toDTO(EventEntity e);

    @InheritInverseConfiguration
    EventEntity toEntity(EventDTO d);
}
