package com.colin.creational.build;

/**
 * Description:将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 *
 * @author zhy
 * @date 2020/5/25
 */
public class User {

  private String name;
  private int age;
  private String email;
  private String phone;

  private User(UserBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.email = builder.email;
    this.phone = builder.phone;
  }

  public String toString() {
    return "[name=" + name + " age=" + age
        + " email=" + email + " phone=" + phone + "]";
  }

  public static class UserBuilder {

    private String name;
    private int age;
    private String email;
    private String phone;

    public UserBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public UserBuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public UserBuilder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public User build() {
      return new User(this);
    }

  }
}
