package controller.handler.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * Created by geyao on 2017/3/25.
 */
@Controller
public class UserLogInHandler {
    private static final String clazzMappingUrl = "";



    @RequestMapping(value = "/userLogIn", method = RequestMethod.POST)
    public String logIn(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "passWord") String passWord,
            HttpSession session
    ){
        //每一次登录，都清除session里所有存留的信息
        Enumeration<String> iterator = session.getAttributeNames();
        if (iterator.hasMoreElements()){
            session.removeAttribute(iterator.nextElement());
        }
        return "home";
    }
}
