package com.rita.gaieski.exemplolomboksaoleo.controle;

import com.rita.gaieski.exemplolomboksaoleo.modelo.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsuarioControle {

    // determinamos as rotas da API Rest
    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo ao site da Galera!";
    }

    @GetMapping("/usuario")
    public Usuario getUsuario(){

        Usuario us = new Usuario();

        us.setNome("Rita de Cassia");
        us.setIdade(31);
        us.setEmail("rita.gaieski@qi.edu.br");
        return us;
    }

    @GetMapping("/informacoes")
    public String getInformacoes(){

        Usuario us = new Usuario();

        us.setNome("Rita de Cassia");
        us.setIdade(31);
        us.setEmail("rita.gaieski@qi.edu.br");

        return "Resultado: "+us.converterIdadeEmDias();

    }

    @GetMapping("/registros")
    public ArrayList<Usuario> getLista(){

        Usuario us1 = new Usuario();

        us1.setNome("Rita de Cassia");
        us1.setIdade(31);
        us1.setEmail("rita.gaieski@qi.edu.br");

        Usuario us2 = new Usuario();

        us2.setNome("Gabriel");
        us2.setIdade(18);
        us2.setEmail("gabriel.muekedevila@gmail.com");

        ArrayList<Usuario> cadastro = new ArrayList<>();

        cadastro.add(us1);
        cadastro.add(us2);

        return cadastro;
    }//fecha o metodo
}//fim
