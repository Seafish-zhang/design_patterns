package com.colin.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class UserService {

  private List<RegObserver> regObserverList = new ArrayList<>();

  public void addRegObserver(RegObserver regObserver) {
    regObserverList.add(regObserver);
  }

  public void register(User user) {
    // 注册用户

    // 通知所有观察者
    for (RegObserver regObserver : regObserverList) {
      regObserver.handleRegSuccess(user.getUserId());
    }
  }
}
