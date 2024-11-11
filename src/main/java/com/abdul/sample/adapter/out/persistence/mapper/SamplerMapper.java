package com.abdul.sample.adapter.out.persistence.mapper;


import com.abdul.sample.adapter.out.persistence.entity.Sample;
import com.abdul.sample.domain.sample.model.SampleInfo;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

/*
 * note -> Maps model info objects to entity objects and vice versa
 */
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SamplerMapper {

    Sample map(SampleInfo sampleInfo);

    SampleInfo map(Sample sample);
}
