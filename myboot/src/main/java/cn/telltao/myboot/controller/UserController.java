package cn.telltao.myboot.controller;

import cn.telltao.myboot.entity.User;
import cn.telltao.myboot.service.IUserService;
import cn.telltao.myboot.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.telltao.myboot.utils.AjaxJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/** 用户登录 Controller
 *
 *
 * @author Liu Tao
 * @date 2018/9/6 16:48
 */
@Controller
//使用此注解 idea要装lombock插件  链接 https://blog.csdn.net/zhglance/article/details/54931430
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    String welcom(){

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

            if(null != entity && null != entity.getId() && null != entity.getName()){
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
        if(StringUtils.isNotEmpty(loginName)){
            QueryWrapper<User> wrapper  = new QueryWrapper<User>();
            wrapper.eq("login_name",loginName);
            userList = userService.selectList(wrapper);
            log.info("带条件查询中....");
        }else{
           userList = userService.selectList(null);
            log.info("无条件查询中....");
        }
        //封装方法 返回给页面
        StringUtils.printJson(response, JSON.toJSONString(userList));
    }

}
