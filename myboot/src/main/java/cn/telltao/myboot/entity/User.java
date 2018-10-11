package cn.telltao.myboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @author Liu Tao
 * @date 2018/10/10  12:10
 *
 */
@TableName("sys_user")
@Data
public class User implements Serializable {

    /** 编号 */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /** 登录名 */
    @TableField(value = "login_name")
    private String loginName;

    /** 姓名 */
    @TableField(value = "name")
    private String name;

    /** 密码 */
    @TableField(value = "password")
    private String password;

    /** 邮箱 */
    @TableField(value = "email")
    private String email;

    /** 年龄 */
    @TableField(value = "age")
    private Integer age;

    /** 创建日期 */
    @TableField(value = "create_time")
    private String createTime;

    /** 最后一次登录时间*/
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /** 用户状态 0启用 1禁用 */
    @TableField(value = "status")
    private String status;

    public User() {
    }

}