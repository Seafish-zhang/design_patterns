package com.colin.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:实现中介者接口，定义一个 List 来管理同事对象，
 * <p>
 * 协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 *
 * @author zhy
 * @date 2020/5/25
 */
public class ConcreteMediator implements Mediator {

  private Set<Colleague> colleagueSet = new HashSet<>();

  public void register(Colleague colleague) {
    colleagueSet.add(colleague);
    colleague.setMediator(this);
  }

  public void relay(Colleague relayColleague) {
    for (Colleague colleague : colleagueSet) {
      if (!colleague.equals(relayColleague)) {
        colleague.receive();
      }
    }
  }
}
