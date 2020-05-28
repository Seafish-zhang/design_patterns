package com.colin.behavioral.observer;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class RegAwardObserver implements RegObserver {

  @Override
  public void handleRegSuccess(long userId) {
    System.out.println("注册奖励");
  }
}
