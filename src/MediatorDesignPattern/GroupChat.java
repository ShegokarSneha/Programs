package MediatorDesignPattern;

public class GroupChat {

	public static void main(String[] args) {
		ChatRoom mediator = new ChatMedia();
		User user1 = new UserChat(mediator, "Pankaj");
		User user2 = new UserChat(mediator, "Lisa");
		User user3 = new UserChat(mediator, "Saurabh");
		User user4 = new UserChat(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hello All");

	}

}
