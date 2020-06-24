package com.rita.gaieski.exemplolomboksaoleo.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {//

    @Getter @Setter
    private String nome;
    @Getter @Setter
    private int idade;
    @Getter @Setter
    private String email;

    public int converterIdadeEmDias(){
        return idade*365;
    }

}// fim
