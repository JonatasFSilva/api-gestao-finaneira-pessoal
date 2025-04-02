package com.api.gestao.financeira.pessoal.apigestao_financeira_pessoal.controller;

import com.api.gestao.financeira.pessoal.apigestao_financeira_pessoal.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> searchAll() {
        User newUser = new User(1L, "Jonatas", "teste@test.com", "1234");
        return ResponseEntity.ok().body(newUser);
    }
}
