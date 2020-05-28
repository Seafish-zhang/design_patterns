package com.colin.behavioral.chain;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class HandleB extends Handle {

  @Override
  public void handle(int number) {
    System.out.println("entry HandleB");
    if (number < 20) {
      System.out.println("HandleB deal");
    } else {
      if (successor != null) {
        successor.handle(number);
      } else {
        System.out.println("No Handle deal");
      }
    }
  }
}
