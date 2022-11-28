package com.example.flex_api.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long articleId;
    private String body;
}
