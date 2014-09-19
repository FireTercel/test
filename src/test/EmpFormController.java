package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class EmpFormController extends SimpleFormController {

	
	
	
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String, Object> model=new HashMap<String, Object>();
		model.put("deptList", new String[]{"sales","manage"});
		return model;
	}

	/**
	 * onSubmit方法，是当表单提交时处理请求
	 * 3.0版本后少用。
	 * 如果使用command控制器，只要Url符合要求，自动就会提交
	 * 如果使用Form控制器，只有表单是method="post"时，才会去执行onSubmit方法。
	 */
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		
		Emp emp = (Emp) command;
		// service.addEmp(emp);
		System.out.println(emp);
		return new ModelAndView(getSuccessView());
		
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	
	

}
