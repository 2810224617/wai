package org.maven02.web;

import java.util.List;

import javax.annotation.Resource;

import org.maven02.pojo.Dept;
import org.maven02.pojo.Emp;
import org.maven02.service.empService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
	@Resource
	private empService es;
	
	@RequestMapping("/emplist")
	public String selectAll(ModelMap map,Emp emp) {
		List<Emp> el = es.selectAll(emp);
	 List<Dept>	dl=es.selectDept();
	 Emp e=null;
	 if (emp!=null&&emp.getEid()!=null) {
		e=es.selectId(emp.getEid());
	}
		map.put("e", e);
		map.put("el",el);
		map.put("dl", dl);
		System.out.println(el);
		return "list";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(Integer eid) {
		System.out.println("12");
		es.deleteEmp(eid);
		return "redirect:emplist";

		
	}
	@RequestMapping("/indexEmp")
	public String indexEmp(Emp emp){
		System.out.println("123");
		es.indexEmp(emp);
		return "redirect:emplist";
	}
	@RequestMapping("/update")
	public String updateEmp(Emp emp) {
 es.update(emp);
return "redirect:emplist";
	}
	

}
