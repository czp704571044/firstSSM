package com.ssm.Controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.Po.User;
import com.ssm.Service.UserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/loginPage.do")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login.do")
	public ModelAndView login(ModelAndView mv,HttpSession hs,String username,String password) {
		User user=userService.login(username, password);
		if(user!=null) {
			hs.setAttribute("user", user);
			mv.addObject("msg", "您登陆成功！");
			mv.setViewName("success");
		}
		else {
			System.out.println("登陆失败");
			mv.addObject("msg", "您登陆失败");
		    mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping(value="/registerPage.do")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value="/register.do")
	public String  register(User user) {
		userService.save(user);
		return "login";
		
	}
	
	@RequestMapping(value="/updatePage.do")
	public String updatePage() {
		return "update";
	}
	
	@RequestMapping(value="/update.do")
	public String updateUser(User user,HttpServletRequest request,Model model) {
		if(userService.update(user)) {
			user=userService.findUserById(user.getUserId());
			request.setAttribute("user", user);
			model.addAttribute("user", user);
			return "allUser";
		}
		else {
			return "error";
		}
	}
	
	@RequestMapping(value="findUserById")
	public String findUserById(int userId,HttpServletRequest request,Model model) {
		request.setAttribute("user", userService.findUserById(userId));
		model.addAttribute("user", userService.findUserById(userId));
		return "update";
		
	}
	
	@RequestMapping(value="delete.do")
	public String deleteUser(int userId,HttpServletRequest request,HttpServletResponse response) {
		if(userService.delete(userId)) {
		 return "allUser";
		}
		return "error";
	}
	
	@RequestMapping(value="getAllUser")
	public String getAllUser(HttpServletRequest request,Model model) {
		List<User>userList=userService.findAll();
		model.addAttribute("userList", userList);
		request.setAttribute("userList", userList);
		return "allUser";
	}
	
	
	
	
	
	
	
	
	
	
	
	
 
}