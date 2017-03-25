package model.com.pojo.domain.DAO;

import model.com.pojo.domain.valueObject.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import persistence.mybatis.interfaces.user.UserMapper;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by geyao on 2017/3/25.
 */
@Repository("userDAO")
public class UserDAO {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public UserVO getNormalUserVOByLogIn(String userName, String passWord){
        return userMapper.getUserVOByLogIn(userName, passWord);
    }

    public UserVO saveNormalUserVO(UserVO userVO){
        userMapper.saveUserVO(userVO);
        return userVO;
    }
}
