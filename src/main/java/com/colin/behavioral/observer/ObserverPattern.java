package com.colin.behavioral.observer;

/**
 * Description:观察者（Observer）模式的定义：指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式。
 * <p>
 * 观察者模式是一种对象行为型模式，其主要优点如下。
 * <p>
 * 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。 目标与观察者之间建立了一套触发机制。
 * <p>
 * <p>
 * 它的主要缺点如下。
 * <p>
 * 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。 当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
 *
 * @author zhy
 * @date 2020/5/28
 */
public class ObserverPattern {

  public static void main(String[] args) {
    UserService userService = new UserService();
    userService.addRegObserver(new RegAwardObserver());
    userService.addRegObserver(new RegNotifyObserver());
    userService.register(new User());
  }
}
