package com.colin.structural.proxy;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class SubjectImpl implements Subject {

  @Override
  public void talk() {
    System.out.println("SubjectImpl talk");
  }
}
