package SingletonDesignPatterns;

public enum EnumSingleton {
	
	INSTANCE;
	static int i;
	public static void show(){
        System.out.println("Value Of Integer:" + i);
    }

}
