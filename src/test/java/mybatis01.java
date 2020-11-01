import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import study.mybatis01.dao.UserDao;
import study.mybatis01.entity.User;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class mybatis01{

    @Test
    public void test01() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获取连接对象
        SqlSession sqlSession = factory.openSession();
        //通过连接对象获取接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //条用接口中的方法
       // System.out.println(userDao.selectUserById(3));
//        System.out.println(userDao.selectUserByIdAndPwd(2,"3"));
//        System.out.println(userDao.selectUserByName("B"));
        User user = new User();
        //user.setId(2);
        user.setName("兰芝");
        user.setSex("女");
        user.setPassword("789");
        user.setBrithday(new Date());
        user.setRegisTime(new Date());
//        userDao.updateUserById(user);
        //System.out.println(userDao.selectUserById(2));
        userDao.insertUser(user);
        sqlSession.commit();//为什么一定需要commit
        System.out.println(user.toString());
        sqlSession.close();


    }

}
