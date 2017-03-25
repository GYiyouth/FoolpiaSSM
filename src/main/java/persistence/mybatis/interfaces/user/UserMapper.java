package persistence.mybatis.interfaces.user;

import model.com.pojo.domain.valueObject.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by geyao on 2017/3/25.
 */
@Component("userMapper")
public interface UserMapper {

    UserVO getUserVOByLogIn(HashMap map);

    UserVO getUserVOByLogIn(
            @Param("userName")String userName,
            @Param("passWord")String passWord
    );

    void saveUserVO(UserVO userVO);
}
