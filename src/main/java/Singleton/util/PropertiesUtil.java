package Singleton.util;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties load(String ruta) {
		Properties props = new Properties();
		try {
			props.load(new FileReader(ruta));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	

}
