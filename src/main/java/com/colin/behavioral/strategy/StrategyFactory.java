package com.colin.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/28
 */
public class StrategyFactory {

  private static Map<Integer, Strategy> strategyMap = new HashMap<>();

  static {
    strategyMap.put(0, new StrategyImplA());
    strategyMap.put(1, new StrategyImplB());
  }

  public Strategy getStrategy(int type) {
    if (strategyMap.containsKey(type)) {
      return strategyMap.get(type);
    } else {
      throw new NullPointerException();
    }
  }

}
