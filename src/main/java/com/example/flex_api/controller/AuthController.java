package com.example.flex_api.controller;


import com.example.flex_api.dto.MemberRequestDto;
import com.example.flex_api.dto.MemberResponseDto;
import com.example.flex_api.dto.TokenDto;
import com.example.flex_api.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<MemberResponseDto> signup(@RequestBody MemberRequestDto requestDto){
        return ResponseEntity.ok(authService.signUp(requestDto));
    }

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody MemberRequestDto requestDto){
        return ResponseEntity.ok(authService.login(requestDto));
    }
}
