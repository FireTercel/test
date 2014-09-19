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
	 * onSubmit�������ǵ����ύʱ��������
	 * 3.0�汾�����á�
	 * ���ʹ��command��������ֻҪUrl����Ҫ���Զ��ͻ��ύ
	 * ���ʹ��Form��������ֻ�б���method="post"ʱ���Ż�ȥִ��onSubmit������
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
