package cn.telltao.myboot.controller;

import cn.telltao.myboot.entity.User;
import cn.telltao.myboot.enums.UserStatusEnum;
import cn.telltao.myboot.service.IUserService;
import cn.telltao.myboot.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.telltao.myboot.utils.AjaxJson;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;

/** 用户登录 Controller
 * @author Liu Tao
 * @date 2018/9/6 16:48
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    String welcome(){

        return "login.html";
    }

    @PostMapping("/login")
    @ResponseBody
    public AjaxJson login(@RequestBody User user){

        AjaxJson ajaxJson = new AjaxJson();

        String loginName = user.getLoginName();
        String password = user.getPassword();

        if(StringUtils.isNotEmpty(loginName) && StringUtils.isNotEmpty(password)){

            //查询一条数据
            QueryWrapper<User> wrapper  = new QueryWrapper<User>();
            wrapper.eq("login_name",loginName);
            wrapper.eq("password",password);
            User entity = userService.selectOne(wrapper);
            //账户被禁用
            if(entity.getStatus() == UserStatusEnum.DISABLE.getCode()){
                ajaxJson.success("该账户已被禁用,请联系管理员!");
                log.info("用户[{}],登录失败,账户已禁用",entity.getName());
                return ajaxJson;

            }else if(null != entity && null != entity.getId() && null != entity.getName()){
                ajaxJson.success("登录成功");
                log.info("用户[{}],登录成功!",entity.getName());
                return ajaxJson;
            }
        }
        ajaxJson.fail("用户名或密码有误!");
        log.error("登录失败,用户名或密码错误!");
        return ajaxJson;
    }

    @PostMapping(value = "/ajaxList")
    private void ajaxList(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String loginName = request.getParameter("loginName");
        Collection<User> userList = null;
        //mybatis-plus 自己封装的查询类
        QueryWrapper<User> wrapper  = new QueryWrapper<User>();
        wrapper.orderByDesc("id");
        if(StringUtils.isNotEmpty(loginName)){
            wrapper.eq("login_name",loginName);
            userList = userService.selectList(wrapper);
            log.info("带条件查询中....");
        }else{
            userList = userService.selectList(wrapper);
            log.info("无条件查询中....");
        }
        //封装方法 返回给页面
        StringUtils.printJson(response, JSON.toJSONString(userList));
    }


    @PostMapping(value = "/insertUser")
    @ResponseBody
    private AjaxJson insertUser(@RequestBody User user){

        //数据非空校验暂时不写

        AjaxJson ajaxJson = new AjaxJson();
        user.setCreateTime(new Date());
        user.setLastLoginTime(new Date());
        user.setStatus(UserStatusEnum.ENABLE.getCode());

        boolean status = userService.insert(user);
        if(status){
            ajaxJson.success("添加成功!");
            log.info("添加用户成功");
            return  ajaxJson;
        }
        ajaxJson.fail("添加失败,请重试!");
        log.error("添加用户失败,数据为 {}",JSON.toJSON(user));
        return  ajaxJson;
    }

    /**
     * 启用禁用
     */
    @PostMapping(value = "/editStatus")
    @ResponseBody
    public AjaxJson editStatus(User user) {
        AjaxJson ajaxJson = new AjaxJson();
        User selUser = userService.selectById(user.getId());
        selUser.setStatus(user.getStatus());
        //修改状态
        boolean status = userService.insertOrUpdate(selUser);
        if(status){
            ajaxJson.success("修改成功");
            return  ajaxJson;
        }
        ajaxJson.fail("修改失败");
        log.error("修改用户状态失败,入库数据为 {}",JSON.toJSON(selUser));
        return ajaxJson;
    }
}
