package tool.com;

import net.sf.json.JSONObject;
import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GR on 2017/2/26.
 */
public class BeanFactory {
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    public static <T>T getBean(String id, Class<T> aClass){
        return getApplicationContext().getBean(id, aClass);
    }
    public static Object getBean(String id){
        return getApplicationContext().getBean(id);
    }
    public static ApplicationContext getNewContext(){
        return new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }
    public static SqlSessionFactoryBean getSessionFactory(){
        return getApplicationContext().getBean("sqlSessionFactory", SqlSessionFactoryBean.class);
    }

    public static JSONObject getJSON(){
        return getBean("jsonObject", JSONObject.class);
    }
}
