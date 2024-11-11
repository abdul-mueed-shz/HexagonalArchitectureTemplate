package com.abdul.sample.domain.sample.port.in;

import com.abdul.sample.domain.sample.model.SampleRequestInfo;

public interface CreateSampleUseCase {

    Long execute(SampleRequestInfo sampleRequestInfo);
}
