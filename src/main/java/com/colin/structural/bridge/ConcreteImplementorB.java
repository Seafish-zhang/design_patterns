package com.colin.structural.bridge;

/**
 * Description:给出实现化角色接口的具体实现.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class ConcreteImplementorB implements Implementor {

  @Override
  public void operationImpl() {
    System.out.println("ConcreteImplementorB");
  }
}
