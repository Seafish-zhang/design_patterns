package com.colin.structural.adapter;

/**
 * Description:对象适配器，基于组合.
 * <p>
 * 两者对比：
 * <p>
 * 1、如果Adaptee接口并不多，两种实现方式都可以
 * <p>
 * 2、如果Adaptee接口很多，而且Adaptee接口和Itarget接口定义大部分相同，
 * <p>
 * 推荐用类适配器方式，这样Adaptord代码量要少一点 3、如果Adaptee接口很多，而且Adaptee接口和Itarget接口定义大部分不相同
 * <p>
 * 推荐用对象适配器方式，组合结构相对于继承更加灵活
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Adaptor2 implements ITarget {

  private Adaptee adaptee;

  public Adaptor2(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void f1() {
    //将fa转化成需要得f1
    adaptee.fa();
  }

  @Override
  public void f2() {
    // 重新实现f2（）
  }


  @Override
  public void fc() {
    adaptee.fc();
  }
}
