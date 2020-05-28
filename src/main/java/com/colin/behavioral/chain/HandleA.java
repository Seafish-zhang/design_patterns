package com.colin.behavioral.chain;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class HandleA extends Handle {

  @Override
  public void handle(int number) {
    System.out.println("entry HandleA");
    if (number < 10) {
      System.out.println("HandleA deal");
    } else {
      if (successor != null) {
        successor.handle(number);
      } else {
        System.out.println("No Handle deal");
      }
    }
  }
}
