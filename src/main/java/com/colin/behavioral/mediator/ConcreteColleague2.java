package com.colin.behavioral.mediator;

/**
 * Description:是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * @author zhy
 * @date 2020/5/25
 */
public class ConcreteColleague2 extends Colleague {

  public void receive() {
    System.out.println("具体同事类2收到请求。");
  }

  public void send() {
    System.out.println("具体同事类2发出请求。");
    mediator.relay(this); //请中介者转发
  }
}
