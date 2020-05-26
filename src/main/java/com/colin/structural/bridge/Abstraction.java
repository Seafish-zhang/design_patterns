package com.colin.structural.bridge;

/**
 * Description:抽象类，并包含一个对实现化对象的引用.
 *
 * @author zhy
 * @date 2020/5/26
 */
public abstract class Abstraction {

  protected Implementor implementor;

  protected Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  abstract void operationImpl();
}
