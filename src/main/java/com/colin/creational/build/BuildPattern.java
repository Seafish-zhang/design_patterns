package com.colin.creational.build;

import com.colin.creational.build.User.UserBuilder;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/25
 */
public class BuildPattern {

  public static void main(String[] args) {
    User user = new UserBuilder().setName("A").setAge(15).setEmail("123456789@qq.com")
        .setPhone("13012345678").build();
    System.out.println(user);
  }
}
