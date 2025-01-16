package com.example.demo.domain.wiseSaying.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WiseSaying {

    @Builder.Default
    private int id = 1;
    private String title;
    private String content;
    private String author;
}
