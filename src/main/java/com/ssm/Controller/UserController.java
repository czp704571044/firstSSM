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
	
	@RequestMapping(value="/addUserPage.do")
	public String addUserPage() {
		return "addUserPage";
	}
	
	@RequestMapping(value="/addUser.do")
	public String addUser(User user) {
		userService.save(user);
		return "redirect:/user/getAllUser.do";
	}
	
	@RequestMapping(value="/updateUserPage.do")
	public String updatePage(int userId,Model model) {
		User user=userService.findUserById(userId);
		model.addAttribute("user", user);
		return "updateUserPage";
	}
	
	@RequestMapping(value="/updateUser.do")
	public String updateUser(User user,Model model) {
		if(userService.update(user)) {
			user=userService.findUserById(user.getUserId());
			model.addAttribute("user", user);
			return "redirect:/user/getAllUser.do";
		}
		else {
			return "error";
		}
	}
	
	@RequestMapping(value="/findUserById.do")
	public String findUserById(int userId,HttpServletRequest request,Model model) {
        User user=userService.findUserById(userId);
        model.addAttribute("user", user);
        return "findUserById";
		
	}
	
	@RequestMapping(value="/deleteUser.do")
	public String deleteUser(int userId,HttpServletRequest request,HttpServletResponse response) {
		if(userService.delete(userId)) {
		 return "redirect:/user/getAllUser.do";
		}
		return "error";
	}
	
	@RequestMapping(value="/getAllUser.do")
	public String getAllUser(HttpServletRequest request,Model model) {
		List<User>userList=userService.findAll();
		model.addAttribute("userList", userList);
		request.setAttribute("userList", userList);
		return "allUser";
	}
	
	
	
	
	
	
	
	
	
	
	
	
 
}