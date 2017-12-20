package com.thinksys.security.sec;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;


import com.thinksys.security.model.User;

/**
 * Spring Security success handler, specialized for Ajax requests.
 */
public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {




	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		User user = (User) authentication.getPrincipal() ;
		user.setGrantedAuthorities(authentication.getAuthorities());

		//		bean.set

		//		bean.setGrantedAuthorities(authentication.getAuthorities());
		////		request.getSession().setMaxInactiveInterval(60*60);
		////		request.getSession().setAttribute("productId", user.getIopushProduct().getProductID());
		////		bean.setPid(user.getIopushProduct().getHash());

		logger.info("onAuthenticationSuccess Login Successful!"); 
		SecurityUtils.sendResponse(response, HttpServletResponse.SC_OK, user);
	}

}
