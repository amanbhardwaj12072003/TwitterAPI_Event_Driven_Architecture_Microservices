package com.microservices.api.kafka.stream.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KafkaStreamsResponseModel {
    private String word;
    private Long wordCount;
}
