package com.ssm.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.Po.User;
import com.ssm.Service.UserService;

@Controller("UserController")
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	//登录页面
	@RequestMapping(value="/loginPage.do")
	public String loginPage() {
		return "login";
	}
	
	//登录
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
public ModelAndView login(String username,String password,HttpSession hs,ModelAndView mv) {
	User user=userService.login(username, password);
	if(user!=null) {
		hs.setAttribute("user", user);
		hs.setAttribute("user.username", "user.username");
		mv.addObject("msg","您登录成功");
		mv.setViewName("success");
	}
	else {
		mv.addObject("msg", "您登录失败");
		mv.setViewName("error");
	}
	return mv;
	}
	@RequestMapping(value="/registerPage.do")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	 public ModelAndView  register(ModelAndView mv, String username,User user) {
		User user1=userService.findUserByUsername(username);
		if(user1!=null) {
		 mv.addObject("msg","您已经有帐号了！~");
		 mv.setViewName("error");
		 
		}
		else {
			userService.register(user1);
			mv.addObject("msg", "您已经成功注册");
			mv.setViewName("success");
		}
		return mv;
	}
	@RequestMapping(value="/updatePage.do")
	public String updatePage() {
		return "update";
	}
	@RequestMapping(value="/update.do")
	public ModelAndView update(ModelAndView mv,User user) {
		userService.updateInformation(user);
		mv.addObject("msg", "您已经成功更新用户信息");
		mv.setViewName("success");
		return mv;
	}
	@RequestMapping(value="/findPasswordByUsernamePage.do")
	public String findPasswordByUsernamePage() {
		
		return "findPasswordPage";
	}
	@RequestMapping(value="/findPassword.do")
	public ModelAndView findPassword(ModelAndView mv,User user) {
		userService.updateInformation(user);
		mv.setViewName("login");
		return mv;
	}
}
