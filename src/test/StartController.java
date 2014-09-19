package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 这个控制器，实现的是Controller，比较简单，直接，但是效率比较高
 * @author Administrator
 *
 */
public class StartController implements Controller {

	//View是对模型进行预处理。
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("controller is working!");
		return new ModelAndView("start");
	}

}
