package com.example.sample.basic.dto;

import lombok.*;

/**
 * Sample Response
 */

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SampleResponse {

    private Long id;

    private String name;
}
