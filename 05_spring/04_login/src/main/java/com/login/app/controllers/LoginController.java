package com.login.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.login.app.models.Usuario;
import com.login.app.repository.UsuarioRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository csr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Usuario> usuario = csr.findAll();
        mv.addObject("usuario",usuario);
        return mv;
    }

    @ModelAttribute
    public void addActivePage(HttpServletRequest request, Model model){
        String uri = request.getRequestURI();
        if (uri.contains("/cadastrarUsuario")) model.addAttribute("activePage" , "cadastrar");
        else model.addAttribute("activePage","home");
    }

    @RequestMapping(value="/cadastrarUsuario", method = RequestMethod.GET)
    public String cadastrarUsuario(){
        return "cadastrar-usuario";
    }

    @RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
    public String cadastrarUsuario(Usuario usuario){
        csr.save(usuario);
        return "redirect:/";
    }
}
