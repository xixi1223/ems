import com.baizhi.entity.Emp;
import com.baizhi.entity.User;
import com.baizhi.service.EmpService;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by XIXI on 2019/10/25.
 */
@ContextConfiguration(locations = "classpath:springmvc.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {
    @Autowired
    private UserService userService;
    @Autowired
    private EmpService empService;
    @Test
    public void test1(){
        User user = userService.find("admin", "123456");
        System.out.println(user);
    }
    @Test
    public void test2(){
        List<Emp> list=empService.findAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

}
