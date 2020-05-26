package com.colin.structural.facade;

/**
 * Description:为多个子系统对外提供一个共同的接口.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Facade {

  private SubSystem1 subSystem1 = new SubSystem1Impl();
  private SubSystem2 subSystem2 = new SubSystem2Impl();
  private SubSystem3 subSystem3 = new SubSystem3Impl();

  public void method() {
    subSystem1.method1();
    subSystem2.method2();
    subSystem3.method3();
  }

}
