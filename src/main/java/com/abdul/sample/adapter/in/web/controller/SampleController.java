package com.abdul.sample.adapter.in.web.controller;

import com.abdul.sample.adapter.in.web.mapper.SampleDtoMapper;
import com.abdul.sample.domain.enums.SampleMessageCodeEnum;
import com.abdul.sample.domain.sample.port.in.CreateSampleUseCase;
import com.abdul.sample.domain.sample.port.in.GetSampleUseCase;
import com.abdul.sample.dto.CreateSampleRequest;
import com.abdul.sample.dto.MessageInfo;
import com.abdul.sample.dto.SampleResponse;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/samples")
@RequiredArgsConstructor
public class SampleController {

    private final SampleDtoMapper sampleDtoMapper;
    private final CreateSampleUseCase createSampleUseCase;
    private final GetSampleUseCase getSampleUseCase;

    @PostMapping
    public ResponseEntity<MessageInfo> createSmartContract(
            @Valid @RequestBody CreateSampleRequest createSampleRequest) {
        Long sampleId =
                createSampleUseCase.execute(sampleDtoMapper.map(createSampleRequest));
        return ResponseEntity.ok(
                createMessageInfo(sampleId,
                        SampleMessageCodeEnum.SAMPLE_CONTRACT_CREATED_SUCCESSFULLY.getMessageDescription(),
                        SampleMessageCodeEnum.SAMPLE_CONTRACT_CREATED_SUCCESSFULLY.getMessageCode())
        );
    }


    @GetMapping
    public ResponseEntity<List<SampleResponse>> getSmartContracts() {
        return ResponseEntity.ok(sampleDtoMapper.map(getSampleUseCase.findAll()));
    }

    private MessageInfo createMessageInfo(Long displayableId, String messageDescription, String messageCode) {
        var messageInfo = new MessageInfo();
        messageInfo.setId(displayableId);
        messageInfo.setDisplayableId(displayableId.toString());
        messageInfo.setDisplayableName(displayableId.toString());
        messageInfo.setMessageDescription(messageDescription);
        messageInfo.setMessageCode(messageCode);
        return messageInfo;
    }
}
