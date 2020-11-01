package study.mybatis01.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据对象
 *
 * @author 乐之(田亮)
 * @history 2020年11月01日 新建
 */

@Data
public class User implements Serializable {

        private static final long serialVersionUID = 1L;

        /** */
        private Integer id;

        /** */
        private String name;

        /** */
        private String password;

        /** */
        private String sex;

        /** */
        private Date brithday;

        /** 注册时间*/
        private Date regisTime;

        public User() {
        }

        public User(Integer id, String name, String password, String sex, Date brithday, Date regisTime) {
                this.id = id;
                this.name = name;
                this.password = password;
                this.sex = sex;
                this.brithday = brithday;
                this.regisTime = regisTime;
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", password='" + password + '\'' +
                        ", sex='" + sex + '\'' +
                        ", brithday=" + brithday +
                        ", regisTime=" + regisTime +
                        '}';
        }
}
