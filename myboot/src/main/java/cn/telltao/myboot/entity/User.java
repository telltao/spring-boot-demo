package cn.telltao.myboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @author Liu Tao
 * @date 2018/10/10  12:10
 *
 */
@TableName("sys_user")
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}