package com.abdul.sample.domain.sample.usecase;

import com.abdul.sample.domain.sample.model.SampleRequestInfo;
import com.abdul.sample.domain.sample.port.in.CreateSampleUseCase;
import com.abdul.sample.domain.sample.port.out.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSmartContractUseCaseImpl implements CreateSampleUseCase {

    private final SampleRepository sampleRepository;

    @Override
    public Long execute(SampleRequestInfo sampleRequestInfo) {
        return sampleRepository.save(sampleRequestInfo);
    }
}
