package com.antique.muzi.portal.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginDto {
    // 用户信息原始数据
    private String rawData;

    // 用于验证用户信息是否被篡改过
    private String signature;
    // 用户获取 session_key 的 code
    private String code;

}
