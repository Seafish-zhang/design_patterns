package com.colin.structural.flyweight;

/**
 * Description:所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Flyweight {

  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
