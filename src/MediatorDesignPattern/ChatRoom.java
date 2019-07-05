package MediatorDesignPattern;

public interface ChatRoom {
	public void sendMessage(String msg, User user);

	void addUser(User user);

}
