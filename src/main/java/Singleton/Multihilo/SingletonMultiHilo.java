package Singleton.Multihilo;

public final class SingletonMultiHilo {

	private static SingletonMultiHilo instance;
    public String value;

    private SingletonMultiHilo(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonMultiHilo getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultiHilo(value);
        }
        return instance;
    }
	
}
