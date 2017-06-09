package com.xiaohu.ezec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaohu.ezec.model.TestModel;
import com.xiaohu.ezec.model.vo.UserVo;

@Controller
@RequestMapping(path="security/")
public class SecurityController {

    @RequestMapping(method=RequestMethod.GET, path="login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        
        return "login";
    }
    
    @RequestMapping(method=RequestMethod.POST, path="dologin")
    public String doLogin(HttpServletRequest request, HttpServletResponse response,
           Model model) {
        
        String msg = "";  
        String userName = request.getParameter("userName");  
        String password = request.getParameter("password");  
        System.out.println(userName);  
        System.out.println(password);  
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);  
        token.setRememberMe(true);  
        Subject subject = SecurityUtils.getSubject();  
        try {  
            subject.login(token);  
            if (subject.isAuthenticated()) {
                return "redirect:/";  
            } else {  
                return "login";  
            }  
        } catch (IncorrectCredentialsException e) {  
            msg = "��¼�������. Password for account " + token.getPrincipal() + " was incorrect.";  
            model.addAttribute("message", msg);
            System.out.println(msg);  
        } catch (ExcessiveAttemptsException e) {  
            msg = "��¼ʧ�ܴ�������";  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        } catch (LockedAccountException e) {  
            msg = "�ʺ��ѱ�����. The account for username " + token.getPrincipal() + " was locked.";  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        } catch (DisabledAccountException e) {  
            msg = "�ʺ��ѱ�����. The account for username " + token.getPrincipal() + " was disabled.";  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        } catch (ExpiredCredentialsException e) {  
            msg = "�ʺ��ѹ���. the account for username " + token.getPrincipal() + "  was expired.";  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        } catch (UnknownAccountException e) {  
            msg = "�ʺŲ�����. There is no user with username of " + token.getPrincipal();  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        } catch (UnauthorizedException e) {  
            msg = "��û�еõ���Ӧ����Ȩ��" + e.getMessage();  
            model.addAttribute("message", msg);  
            System.out.println(msg);  
        }  
        return "login";
    }
    
}
