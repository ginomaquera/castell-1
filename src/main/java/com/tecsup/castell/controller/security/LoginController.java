package com.tecsup.castell.controller.security;

import com.tecsup.castell.helper.AppConstant;
import com.tecsup.castell.helper.RolEnum;
import com.tecsup.castell.model.Persona;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = {"login", "/"})
    public String index(HttpSession session, @RequestParam(required = false) String error, Model model) throws Exception {

        Persona autenticado = (Persona) session.getAttribute(AppConstant.USUARIO_AUTENTICADO);

        if (autenticado != null) {
            StringBuilder usuario = new StringBuilder();
                usuario.append(autenticado.getNombres());
                usuario.append(" ");
                usuario.append(autenticado.getPaterno());
                session.setAttribute("usuario", usuario.toString());
                session.setAttribute("rol", autenticado.getUsuario().getRol());
            if (autenticado.getUsuario().getRol().equals(RolEnum.VENTA.toString())) {
                return ("redirect:/categoria");
            } else if (autenticado.getUsuario().getRol().equals(RolEnum.ADMIN.toString())) {                
                
                return ("redirect:/adm/vendedor");
            }            
            
        }

        if (error != null) {
            model.addAttribute("loginError", true);
        }

        return "login/index";
    }
    
    	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		System.out.println("Login form is loading");
		return "login/index";
	}

}
