import com.iphan.dao.ProductDatabaseDAO;
import com.iphan.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.iphan.config.MybatisConfig.class, com.iphan.config.SpringConfig.class})
public class TestDAO {
    @Autowired
    ProductDatabaseDAO productDatabaseDAO;
    @Autowired
    ProductService productService;
    @Test
    public void testDaoLikeMethod(){
            List<String> li = productDatabaseDAO.findLike("飞羽");
        System.out.println(li);
    }

    @Test
    public void testService(){
        List<String> li = productService.getProductLike("锈蚀");
        System.out.println(li);
    }
}
