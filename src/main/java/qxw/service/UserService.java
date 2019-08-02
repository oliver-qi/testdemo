package qxw.service;

import qxw.entity.UserVo;

public interface UserService {

	UserVo login(String username, String pwd);

}
