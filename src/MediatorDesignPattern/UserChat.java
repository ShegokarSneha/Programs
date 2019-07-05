package MediatorDesignPattern;

public class UserChat extends User{
	public UserChat(ChatRoom med, String name) {
		super(med, name);
		
	}

	@Override
	public void send(String msg) {
		
		System.out.println(this.name+" : Sending Message "+"\n"+msg);
		media.sendMessage(msg, this);

		
	}

	@Override
	public void receive(String msg) {
		
		System.out.println("\n"+this.name+" : Received Message : "+msg);
	}

}
