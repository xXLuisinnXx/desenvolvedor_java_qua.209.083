package com.curso.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.app.models.Usuario;
import com.curso.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "home";
    }

    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro"; // Retorna cadastro.html
    }

    @PostMapping("/salvarUsuario")
    public String salvarUsuario(Usuario usuario) {
        String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);
        repository.save(usuario);
        return "redirect:/login";
    }
}
