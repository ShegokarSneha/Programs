package SingletonDesignPatterns;

public class ThreadSafeSingleton {
	
	private ThreadSafeSingleton() {
		
	}
	
	private static ThreadSafeSingleton threadSafeInstance;
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(threadSafeInstance == null) {
			return threadSafeInstance = new ThreadSafeSingleton();
		}
		else {
		return threadSafeInstance;
		}
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
		if(threadSafeInstance == null){
			synchronized (ThreadSafeSingleton.class) {
            if(threadSafeInstance == null){
            	threadSafeInstance = new ThreadSafeSingleton();
            }
        }
    }
    return threadSafeInstance;
}

}
