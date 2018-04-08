package org.seasar.example;

public class HelloMessageProvider implements IMessageProvider {

	private IMessageTartget messageTarget;

	@Override
	public void setMessageTarget(IMessageTartget messageTartget) {
		// TODO 自動生成されたメソッド・スタブ
		this.messageTarget = messageTartget;
	}

	@Override
	public String getMessage() {
		// TODO 自動生成されたメソッド・スタブ
		return "Hello, " + messageTarget.getName();
	}

}
