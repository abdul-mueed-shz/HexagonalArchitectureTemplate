package com.abdul.sample.domain.sample.port.in;

import com.abdul.sample.domain.sample.model.SampleInfo;
import java.util.List;

public interface GetSampleUseCase {

    List<SampleInfo> findAll();
}
