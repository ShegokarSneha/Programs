package MediatorDesignPattern;

public abstract class User {
	protected ChatRoom media;
	protected String name;
	
	public User(ChatRoom med, String name){
		this.media = med;
		this.name=  name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);


}
