package test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * ���Խ��ܶ������Ŀ�����
 * 
 * @author �ƶ���
 * 
 */
public class EmpMultiController extends MultiActionController {

	public ModelAndView to_add(HttpServletRequest request,
			HttpServletResponse response) {
		// viewName: logic name
		// Model: Map

		ModelAndView mav = new ModelAndView();
		mav.setViewName("add_emp");

		mav.addObject("deptList", new String[] { "sales", "manage" });
		return mav;

	}
	
	public String add_emp(HttpServletRequest request,
			HttpServletResponse response,HttpSession session,Emp emp){
		System.out.println(emp);
		return "success";
	}
	


}
