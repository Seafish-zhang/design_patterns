package com.colin.behavioral.observer;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class RegNotifyObserver implements RegObserver {

  @Override
  public void handleRegSuccess(long userId) {
    System.out.println("注册通知");
  }
}
