package com.colin.structural.decorator;

/**
 * Description:实现抽象装饰的相关方法，并给具体构件对象添加附加的责任.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class ConcreteDecorator extends Decorator {

  public ConcreteDecorator(Component component) {
    super(component);
  }

  public void operation() {
    super.operation();
    addedFunction();
  }

  public void addedFunction() {
    System.out.println("为具体构件角色增加额外的功能addedFunction()");
  }
}
