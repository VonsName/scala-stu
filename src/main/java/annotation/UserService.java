package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/3/27/027 9:47
 */
@Component
public class UserService {

    public UserService() {

        System.out.println("UserService");
    }

    @Autowired
    private UserBean userBean;

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public void test() {
        userBean.equals(1);
    }
}
