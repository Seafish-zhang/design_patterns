package com.colin.behavioral.template;

/**
 * Description:模板抽象类，规定模板方法,定义模板中具体方法，由子类实现.
 *
 * @author zhy
 * @date 2020/5/28
 */
public abstract class AbstractClass {

  public final void template1() {
    method1();
    method2();
  }

  public final void template2() {
    method3();
    method4();
  }

  protected void method1() {
    System.out.println("do nothing");
  }

  protected void method2() {
    System.out.println("do nothing");
  }

  protected void method3() {
    System.out.println("do nothing");
  }

  protected void method4() {
    System.out.println("do nothing");
  }
}
