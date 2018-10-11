package cn.telltao.myboot.service.impl;

import cn.telltao.myboot.entity.User;
import cn.telltao.myboot.mapper.UserMapper;
import cn.telltao.myboot.service.IUserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}