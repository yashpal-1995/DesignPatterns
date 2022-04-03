package practice.lld.machine.coding;
/**
 * Thread Safe Singleton method 
 * It ensures that only one instance of the class is created  
 * @author Yash
 *
 */
class Singleton{
	
	private static Singleton instance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		
		if(instance == null){
			synchronized(Singleton.class){
				
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Singleton obj = Singleton.getInstance();
		
		System.out.println(obj);
		
        Singleton obj1 = Singleton.getInstance();
		
		System.out.println(obj1);
		
	}

}
