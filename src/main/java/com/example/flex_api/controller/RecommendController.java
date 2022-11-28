package com.example.flex_api.controller;

import com.example.flex_api.dto.MessageDto;
import com.example.flex_api.dto.PostRecommendDto;
import com.example.flex_api.dto.RecommendDto;
import com.example.flex_api.service.RecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recommend")
public class RecommendController {
    private final RecommendService recommendService;

    @GetMapping("/list")
    public ResponseEntity<RecommendDto> getRecommends(@RequestParam(name = "id") Long id) {
        return ResponseEntity.ok(recommendService.allRecommend(id));
    }

    @PostMapping("/")
    public ResponseEntity<MessageDto> postRecommend(@RequestBody PostRecommendDto dto) {
        recommendService.createRecommend(dto.getId());
        return ResponseEntity.ok(new MessageDto("Success"));
    }

    @DeleteMapping("/one")
    public ResponseEntity<MessageDto> deleteRecommend(@RequestParam(name = "id") Long id) {
        recommendService.removeRecommend(id);
        return ResponseEntity.ok(new MessageDto("Success"));
    }

}