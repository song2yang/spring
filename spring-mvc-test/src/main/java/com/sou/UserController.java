package com.sou;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/4/1 4:18 PM
 * @Version : 1.0
 **/
public class UserController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		List<User> userList = new ArrayList<>();
		User userA = new User();
		User userB = new User();
		userA.setUsername("张三");
		userA.setAge(27);
		userB.setUsername("李四");
		userB.setAge(37);
		userList.add(userA);
		userList.add(userB);
		return new ModelAndView("userList", "users", userList);
	}
}
