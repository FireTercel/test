package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * �����������ʵ�ֵ���Controller���Ƚϼ򵥣�ֱ�ӣ�����Ч�ʱȽϸ�
 * @author Administrator
 *
 */
public class StartController implements Controller {

	//View�Ƕ�ģ�ͽ���Ԥ����
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("controller is working!");
		return new ModelAndView("start");
	}

}
