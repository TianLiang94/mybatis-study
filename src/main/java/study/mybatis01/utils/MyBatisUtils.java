package study.mybatis01.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisUtils {
    //获得sqlsession工厂
    private static SqlSessionFactory factory;

    //创建ThredLocal绑定当前线程中的SqlSession对象
    private static final ThreadLocal<SqlSession> tl =new ThreadLocal<SqlSession>();
//    Static{
//        Integer integer = Integer.valueOf(string);
//    }
}

