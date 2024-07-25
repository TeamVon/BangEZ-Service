package com.bangez.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bangez.user.domain.dto.LoginDto;
import com.bangez.user.domain.dto.PrincipalUserDetails;
import com.bangez.user.service.OAuthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class OAuthController {

    private final OAuthService service;

//    @PostMapping("/login/local")
//    public Mono<PrincipalUserDetails> login(@RequestBody LoginDTO dto) {
//        log.info("login: {}", dto);
//        return Mono.just(new PrincipalUserDetails
//                (UserModel.builder()
//                        .id("aaa1234")
//                        .name("test")
//                        .email(dto.getEmail())
//                        .profile("testProfile.jpg")
//                        .roles(List.of(Role.ROLE_USER))
//                        .registration(Registration.LOCAL)
//                        .build(), null));
//    }

    @PostMapping("/login/local")
    public PrincipalUserDetails localLogin(@RequestBody LoginDto dto){
        log.info("로컬 로그인 메소드");
        return service.login(dto);
    }

}