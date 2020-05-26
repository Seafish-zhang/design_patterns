package com.colin.structural.decorator;

/**
 * Description:装饰（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 * <p>
 * 装饰（Decorator）模式的主要优点有：
 * <p>
 * 采用装饰模式扩展对象的功能比采用继承方式更加灵活。 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
 * <p>
 * 其主要缺点是：装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
 * <p>
 * 通常情况下，扩展一个类的功能会使用继承方式来实现。但继承具有静态特征，耦合度高，并且随着扩展功能的增多，
 * <p>
 * 子类会很膨胀。如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，
 * <p>
 * 并在保持真实对象的类结构不变的前提下，为其提供额外的功能，这就是装饰模式的目标。
 *
 * @author zhy
 * @date 2020/5/26
 */
public class DecoratorPattern {

  public static void main(String[] args) {
    Component p = new ConcreteComponent();
    p.operation();
    Component d = new ConcreteDecorator(p);
    d.operation();
  }
}
