package qxw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import qxw.entity.UserVo;
import qxw.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{username}/login/{pwd}")
	public UserVo login(@PathVariable("username") String username,
                        @PathVariable("pwd") String pwd) {
		return userService.login(username, pwd);
	}
	
}
