package qxw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qxw.entity.UserVo;
import qxw.mapper.UserMapper;
import qxw.model.User;
import qxw.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVo login(String username, String pwd) {
		User user = userMapper.selectByPrimaryKey(1);
		if(username.equals(user.getUserName()) && pwd.equals(user.getPassWord())) {
			return new UserVo(user);
		}
		return null;
	}

}
