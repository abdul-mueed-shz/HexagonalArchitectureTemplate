package com.abdul.sample.adapter.in.web.mapper;


import com.abdul.sample.domain.sample.model.SampleInfo;
import com.abdul.sample.domain.sample.model.SampleRequestInfo;
import com.abdul.sample.dto.CreateSampleRequest;
import com.abdul.sample.dto.SampleResponse;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

/*
 * note -> Maps dto objects i.e request/response objects to domain info objects & vice versa
 */
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SampleDtoMapper {

    SampleRequestInfo map(CreateSampleRequest createSampleRequest);

    List<SampleResponse> map(List<SampleInfo> sampleInfoList);

    SampleResponse map(SampleInfo sampleInfo);
}
