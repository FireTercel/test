package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpController extends AbstractCommandController {

	/**
	 * handle方法，是直接处理请求
	 */
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command,
			BindException exception) throws Exception {
		// 自动封装表单参数成command，再强制装换成Emp对象。
		Emp emp = (Emp) command;
		// service.addEmp(emp);
		System.out.println(emp);
		return new ModelAndView("success");
	}

	//注册了日期转换的编辑器
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
