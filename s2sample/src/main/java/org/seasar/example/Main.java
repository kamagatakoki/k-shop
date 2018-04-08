package org.seasar.example;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// app.dicon読込
		SingletonS2ContainerFactory.init();

		S2Container container = SingletonS2ContainerFactory.getContainer();

		IMessageProvider messageProvider = (IMessageProvider) container.getComponent(IMessageProvider.class);

		System.out.println(messageProvider.getMessage());

		SingletonS2ContainerFactory.destroy();
	}

}
