package model.com.pojo.domain.businessObject.User;

import model.com.pojo.domain.DAO.UserDAO;
import model.com.pojo.domain.valueObject.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by geyao on 2017/3/25.
 */
@Service("userLogInBO")
@Transactional
public class UserLogInBO {

    @Resource(name = "userDAO")
    private UserDAO userDAO;

    public UserVO normalUserLogIn(String userName, String passWord) {
        UserVO userVO = userDAO.getNormalUserVOByLogIn("888", "666");
        System.out.println(userVO);
        userVO.setUserName("bbb");
        userVO.setName("葛尧");
//        userVO.setId(null);无需置空，MyBatis会无视里面的值
        userVO = userDAO.saveNormalUserVO(userVO);
        System.out.println(userVO);
        userVO = userDAO.saveNormalUserVO(userVO);
        System.out.println();
        return userVO;
    }
}
