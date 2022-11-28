package com.example.flex_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChangeArticleRequestDto {
    private Long id;
    private String title;
    private String body;
}
