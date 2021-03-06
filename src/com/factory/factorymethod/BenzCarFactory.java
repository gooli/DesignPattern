package com.factory.factorymethod;

/**
 * 工厂抽象接口实现类
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class BenzCarFactory implements CarFactory {

	@Override
	public Car builderCar() {
		return new Benz();
	}
}
