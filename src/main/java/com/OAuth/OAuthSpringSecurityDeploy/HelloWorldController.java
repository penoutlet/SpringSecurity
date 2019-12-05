package com.OAuth.OAuthSpringSecurityDeploy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping({"/","hello"})
	public String helloWorld(Model model, @AuthenticationPrincipal OidcUser user) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		bList.a
		model.addAttribute("name", user.getGivenName());
		return "hello-world";
	}
}
