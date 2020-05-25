package com.colin.behavioral.mediator;

/**
 * Description:测试类.
 *
 * @author zhy
 * @date 2020/5/25
 */
public class MediatorPattern {

  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();
    ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
    ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
    mediator.register(concreteColleague1);
    mediator.register(concreteColleague2);
    concreteColleague1.send();
    concreteColleague2.send();

  }
}
