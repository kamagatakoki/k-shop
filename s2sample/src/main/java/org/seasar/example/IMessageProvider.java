package org.seasar.example;

public interface IMessageProvider {
	public void setMessageTarget(IMessageTartget messageTartget);

	public String getMessage();
}
