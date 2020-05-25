package com.colin.creational.abstractfactory;

/**
 * Description:为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构
 * <p>
 * 为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构
 *
 * @author zhy
 * @date 2020/5/25
 */
public interface AbstractHighTechFactory {

  Computer createComputer();

  Phone createPhone();
}
