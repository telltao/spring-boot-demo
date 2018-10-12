package cn.telltao.myboot.enums;

import lombok.Getter;

/**
 * 用户枚举相关
 * @author Liu Tao
 * @date 2018/10/12 10:51
 */
@Getter
public enum UserStatusEnum {

    ENABLE(0,"启用"),
    DISABLE(1,"禁用")
    ;

    private Integer code;

    private String message;

    UserStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
