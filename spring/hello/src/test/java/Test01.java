import com.xs.config.SpringConfig;
import com.xs.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {





    @Test
    public void test01(){

        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        IUserService userService = ioc.getBean(IUserService.class);
        userService.getUser();

    }
}
