package com.colin.structural.decorator;

/**
 * Description:继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能.
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Decorator implements Component {

  private Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  public void operation() {
    component.operation();
  }
}
