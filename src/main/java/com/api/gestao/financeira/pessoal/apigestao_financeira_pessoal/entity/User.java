package com.api.gestao.financeira.pessoal.apigestao_financeira_pessoal.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    Long id;
    @Column
    String name;
    @Column
    String email;
    @Column
    String password;
}
