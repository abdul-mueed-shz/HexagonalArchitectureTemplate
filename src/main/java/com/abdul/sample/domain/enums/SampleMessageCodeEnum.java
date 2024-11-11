package com.abdul.sample.domain.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SampleMessageCodeEnum {

    SAMPLE_CONTRACT_CREATED_SUCCESSFULLY("SC-001", "Sample Created Successfully.");

    private final String messageCode;
    private final String messageDescription;
}
