package com.abdul.sample.domain.sample.port.out.repository;

import com.abdul.sample.domain.sample.model.SampleInfo;
import com.abdul.sample.domain.sample.model.SampleRequestInfo;
import java.util.List;

public interface SampleRepository {

    Long save(SampleRequestInfo sampleInfo);

    List<SampleInfo> findAll();
}
