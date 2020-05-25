package com.colin.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description:原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * <p>
 * 通常适用于以下场景。对象之间相同或相似，即只是个别的几个属性不同的时候。 对象的创建过程比较麻烦，但复制比较简单的时候。
 * <p>
 * 浅拷贝和深拷贝：浅拷贝只会复制索引，不会复制对象本身。深拷贝是重新在内存中分配新对象地址，并指向新的索引.
 * <p>
 * Object类的clone()方法就是浅拷贝.
 * <p>
 * 深拷贝通常有两种，
 * <p>
 * 一种就是递归拷贝对象，对象的引用以及引用对象的引用对象。。。 直到要拷贝的对象只包含基本数据或String类型数据为止
 * <p>
 * 另一种是先将对象序列化，然后再反序列化成新的对象，对象的类需要实现Serializable接口
 *
 * @author zhy
 * @date 2020/5/25
 */
public class PrototypePattern {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ArrayList<User> array = new ArrayList<>();
    array.add(new User("A", 1));
    array.add(new User("B", 2));
    array.add(new User("C", 3));
    //浅拷贝
    System.out.println("浅拷贝");
    ArrayList<User> cloneArray = (ArrayList<User>) array.clone();
    System.out.println(Arrays.toString(array.toArray()));
    System.out.println(Arrays.toString(cloneArray.toArray()));
    cloneArray.get(0).setAge(5);
    System.out.println(Arrays.toString(array.toArray()));
    System.out.println(Arrays.toString(cloneArray.toArray()));

    //深拷贝
    System.out.println("深拷贝");
    ArrayList<User> deepCloneArray = (ArrayList<User>) deepClone(array);
    System.out.println(Arrays.toString(array.toArray()));
    System.out.println(Arrays.toString(deepCloneArray.toArray()));
    deepCloneArray.get(0).setAge(9);
    System.out.println(Arrays.toString(array.toArray()));
    System.out.println(Arrays.toString(deepCloneArray.toArray()));

  }

  private static Object deepClone(Object object) throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    ObjectOutputStream oo = new ObjectOutputStream(bo);
    oo.writeObject(object);
    ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
    ObjectInputStream oi = new ObjectInputStream(bi);
    return oi.readObject();
  }

  public static class User implements Serializable {

    private String name;
    private int age;

    public User(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String toString() {
      return "[name = " + name + " age= " + age + " ]";
    }

  }
}
