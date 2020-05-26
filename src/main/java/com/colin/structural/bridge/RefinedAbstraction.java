package com.colin.structural.bridge;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class RefinedAbstraction extends Abstraction {

  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  void operationImpl() {
    System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
    implementor.operationImpl();
  }
}
