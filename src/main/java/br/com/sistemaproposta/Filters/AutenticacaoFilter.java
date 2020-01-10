/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thiago
 */
@WebFilter(urlPatterns = "/input")
public class AutenticacaoFilter implements Filter{
    private FilterConfig filterConfig;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest  req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp =(HttpServletResponse)servletResponse;
        String action = req.getParameter("action");
        
        HttpSession session = req.getSession();
        boolean autenticar= !(action.equals("FormLogin")||action.equals("Login"));
        boolean naoLogado=session.getAttribute("usr")==null;
        
         //verifica se existe usuario na sessao
        if(autenticar && naoLogado){
            resp.sendRedirect(req.getContextPath()+"/input?action=FormLogin");
            return;
        }
        chain.doFilter(req, resp);
        
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {
        System.out.println("Filtro destruído!");
    }


    
}
