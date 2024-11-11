package com.abdul.sample.domain.sample.usecase;

import com.abdul.sample.domain.sample.model.SampleInfo;
import com.abdul.sample.domain.sample.port.in.GetSampleUseCase;
import com.abdul.sample.domain.sample.port.out.repository.SampleRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetSampleUseCaseImpl implements GetSampleUseCase {

    private final SampleRepository sampleRepository;

    @Override
    public List<SampleInfo> findAll() {
        return sampleRepository.findAll();
    }
}
