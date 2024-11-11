package com.abdul.sample.adapter.out.persistence.adapter;

import com.abdul.sample.adapter.out.persistence.repository.SampleJpaRepository;
import com.abdul.sample.domain.sample.model.SampleInfo;
import com.abdul.sample.domain.sample.model.SampleRequestInfo;
import com.abdul.sample.domain.sample.port.out.repository.SampleRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleRepositoryAdapter implements SampleRepository {

    private final SampleJpaRepository sampleJpaRepository;

    @Override
    public Long save(SampleRequestInfo sampleInfo) {
        /*
         * note -> Call sampleJpaRepository.save etc.
         */
        return 1L;
    }

    @Override
    public List<SampleInfo> findAll() {
        return Collections.emptyList();
    }
}
