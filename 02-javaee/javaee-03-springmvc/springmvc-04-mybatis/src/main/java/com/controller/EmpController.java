package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.domain.TEmp;
import com.service.EmpService;

@Controller
@RequestMapping("/bsr")
@Transactional
public class EmpController {
	
	@Resource
	private EmpService empService;//注入EmpService相当于ref=""

	@RequestMapping("/list.do")
	public ModelAndView list(){
		Map<String,List<TEmp>> data = empService.findAll();
		return new ModelAndView("jsp/list",data);
	}
	
	@RequestMapping("/addInit.do")
	public String addInit(){
		return "jsp/add";
	}
	
	@RequestMapping("/addEmp.do")
	public String addEmp(TEmp emp){
		empService.addEmp(emp);
		return "redirect:list.do";
	}
	
	@RequestMapping("/updateInit.do")
	public String addInit(Integer empno,HttpServletRequest req){
		TEmp emp = empService.selectedById(empno);
		req.setAttribute("emp", emp);
		return "jsp/add";
	}
	
	@RequestMapping("/updateEmp.do")
	public String updateEmp(TEmp emp){
		empService.updateEmp(emp);
		return "redirect:list.do";
	}
	
	@RequestMapping("/deleteEmp.do")
	public String deleteEmp(Integer empno){
		empService.deleteEmp(empno);
		return "redirect:list.do";
	}
	
	@RequestMapping("/test.do")
	@ResponseBody 
	public Map<String,Object> test(@RequestParam(value="name") String name){
		Map<String,Object> map = new HashMap<String,Object>();  
		System.out.println("aaa");
		System.out.println(name);
		if(!name.equals("ddd")){      
			map.put("msg", "该用户名不可用");
        }else{
        	map.put("msg", "可以使用");
        }
		 return map;
	}
/*	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
		dateFormat.setLenient(false);    
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	} */
}
