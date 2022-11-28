package com.example.flex_api.controller;

import com.example.flex_api.dto.CommentRequestDto;
import com.example.flex_api.dto.CommentResponseDto;
import com.example.flex_api.dto.MessageDto;
import com.example.flex_api.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/List")
    public ResponseEntity<List<CommentResponseDto>> getComments(@RequestParam(name = "id") Long id){
        return ResponseEntity.ok(commentService.getComment(id));
    }
    @PostMapping("/")
    public ResponseEntity<CommentResponseDto> postComment(@RequestBody CommentRequestDto request) {
        return ResponseEntity.ok(commentService.createComment(request.getArticleId(), request.getBody()));
    }
    @DeleteMapping("/one")
    public ResponseEntity<MessageDto> deleteComment(@RequestParam(name = "id") Long id){
        commentService.removeComment(id);
        return ResponseEntity.ok(new MessageDto("Success"));
    }
}

