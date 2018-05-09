package com.ssm.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.Po.Administrator;
import com.ssm.Service.AdministratorService;

@Controller
@RequestMapping(value="/administrator.do")
public class AdministratorController {
   
	@Autowired
	private AdministratorService administratorService;
	
	@RequestMapping(value="/loginPage.do")
	public String loginPage() {
		return "administratorPage";
	}
	
	@RequestMapping(value="/login.do")
	public ModelAndView login(ModelAndView mv,HttpSession hs) {
		Administrator administrator=administratorService.findAdministratorByAdministratorName();
		if(administrator!=null) {
			hs.setAttribute("administrator", administrator);
			mv.addObject("msg", "您已经成功登录");
			mv.setViewName("manager");
		}
		else {
			mv.addObject("msg", "您登录失败");
			mv.setViewName("error");	
		}
		return mv;
	}
	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
