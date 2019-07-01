package DesignPatterns;

public class StaticBlockInitialization {
	
	private StaticBlockInitialization() {
		
	}
	
	private static StaticBlockInitialization staticBlockInstance;
	
	static{
        try{
        	staticBlockInstance = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return staticBlockInstance;
    }

}
