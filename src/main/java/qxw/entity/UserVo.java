package qxw.entity;

import lombok.Data;
import qxw.enums.SexEnum;
import qxw.model.User;

import java.util.Date;
import java.util.Objects;

/**
 *
 */
@Data
public class UserVo {
    private Integer id;

    private String userName;

    private String passWord;

    private String mobile;

    private String email;

    private SexEnum sex;

    private Short age;

    private Date birthday;

    private Date addTime;

    public UserVo(){}

    public UserVo(Integer id, String userName, String passWord, String mobile,
                  String email, SexEnum sex, Short age, Date birthday, Date addTime) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.mobile = mobile;
        this.email = email;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.addTime = addTime;
    }

    public UserVo(User user){
        if(Objects.isNull(user)){
            new UserVo();
            return;
        }
        this.id = user.getId();
        this.userName = user.getUserName();
        this.passWord = user.getPassWord();
        this.mobile = user.getMobile();
        this.email = user.getEmail();
        setSex(user.getSex());
        this.age = user.getAge();
        this.birthday = user.getBirthday();
        this.addTime = user.getAddTime();
    }

    public String  getSex() {
        return sex.getName();
    }

    public void setSex(Short sex) {
        this.sex = SexEnum.getEnumById(sex);
    }
}
