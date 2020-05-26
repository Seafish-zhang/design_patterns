package com.colin.structural.decorator;

/**
 * Description:实现抽象构件，通过装饰角色为其添加一些职责.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class ConcreteComponent implements Component {

  public ConcreteComponent() {
    System.out.println("创建具体构件角色");
  }

  @Override
  public void operation() {
    System.out.println("调用具体构件角色的方法operation()");
  }

}
