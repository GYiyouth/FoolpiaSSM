import model.com.pojo.domain.DAO.UserDAO;
import model.com.pojo.domain.businessObject.User.UserLogInBO;
import model.com.pojo.domain.valueObject.UserVO;
import tool.com.BeanFactory;

/**
 * Created by geyao on 2017/3/23.
 */
public class Test {
    public static void main(String[] args) {
//        UserDAO userDAO = BeanFactory.getBean("userDAO", UserDAO.class);
//        UserVO userVO = userDAO.getNormalUserVOByLogIn("888", "666");
//        System.out.println(userVO);
//        userVO.setUserName("aaa");
//        userVO.setName("葛尧");
//        userVO.setId(null);
//        userVO = userDAO.saveNormalUserVO(userVO);
//        System.out.println(userVO);

        UserLogInBO userLogInBO = BeanFactory.getBean("userLogInBO", UserLogInBO.class);
        userLogInBO.normalUserLogIn("666", "666");
    }
}
