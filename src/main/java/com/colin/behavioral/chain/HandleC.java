package com.colin.behavioral.chain;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class HandleC extends Handle {

  @Override
  public void handle(int number) {
    System.out.println("entry HandleC");
    if (number < 30) {
      System.out.println("HandleC deal");
    } else {
      if (successor != null) {
        successor.handle(number);
      } else {
        System.out.println("No Handle deal");
      }
    }
  }
}
