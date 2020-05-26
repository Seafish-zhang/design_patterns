package com.colin.structural.adapter;

/**
 * Description:类适配器，基于继承.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Adaptor1 extends Adaptee implements ITarget {

  @Override
  public void f1() {
    //将fa转化成需要得f1
    super.fa();
  }

  @Override
  public void f2() {
    // 重新实现f2（）
  }

  //fc不用实现，直接继承Adaptee，这是和对象适配器最大得不同点
}
