package com.example.flex_api.repository;

import com.example.flex_api.dto.PageResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArticleRepositoryCustom {
    Page<PageResponseDto> searchAll(Pageable pageable);
}
