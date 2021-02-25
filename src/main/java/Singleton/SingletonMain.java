package Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		ConfigurationSingleton singletonA = ConfigurationSingleton.getInstance();
		ConfigurationSingleton singletonB = ConfigurationSingleton.getInstance();
		
		System.out.println(singletonA);
		System.out.println(singletonB);
		
		System.out.println("Misma instancias => " + (singletonA == singletonB));
		
		singletonA.setAppName("Singleton Pattern");
		singletonA.setAppVersion("1.0x");
		
		System.out.println("Singleton A => " + singletonA);
		System.out.println("Singleton B => " + singletonB);
		
		singletonA = null;
		singletonB = null;
		
		singletonA = ConfigurationSingleton.getInstance();
		System.out.println("Singleton A => " + singletonA);
	}
	
}
