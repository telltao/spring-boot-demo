package cn.telltao.myboot.mapper;

import cn.telltao.myboot.base.SuperMapper;
import cn.telltao.myboot.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * User 表数据库控制层接口
 */
@Mapper
public interface UserMapper extends SuperMapper<User>{

}