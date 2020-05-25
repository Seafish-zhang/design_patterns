package com.colin.behavioral.mediator;

/**
 * Description:实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，
 * <p>
 * 因此它依赖于同事角色。
 *
 * @author zhy
 * @date 2020/5/25
 */
public abstract class Colleague {

  protected Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receive();

  public abstract void send();
}
