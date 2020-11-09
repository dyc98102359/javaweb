package com.shu.mapper;

import com.shu.entity.LoginUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ILoginUser {
    /**
     * 根据手机号查询用户
     * @param tele_num
     * @return
     */
    LoginUser getUserByTele(String tele_num);

    /**
     * 更新密码
     * @param tele_num
     * @param password
     * @param salt
     * @return
     */
    int updatePassword(String tele_num, String password,String salt);

    int saveLoginUser(String name, String tele_num);

    int delScanLogin(String username);

    String getSessionid(String username);


}


