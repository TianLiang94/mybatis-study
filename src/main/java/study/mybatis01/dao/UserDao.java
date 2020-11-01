package study.mybatis01.dao;

import org.apache.ibatis.annotations.Param;
import study.mybatis01.entity.User;

public interface UserDao {

    public User selectUserById(Integer id);

    public User selectUserByIdAndPwd(@Param("id") Integer id,@Param("password") String password);

    //模糊查询
    public User selectUserByName(@Param("name") String name);

    //根据活动id修改user
    public int updateUserById(User user);

    //插入数据并且回旋主键
    public int insertUser(User user);

}
