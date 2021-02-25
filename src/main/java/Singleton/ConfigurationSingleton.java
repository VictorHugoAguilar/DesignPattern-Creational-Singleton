package Singleton;

import java.util.Properties;

import Singleton.util.PropertiesUtil;

/**
 * Esta clase representa al Singleton y podemos ver que tiene una referencia a
 * si misma mediante una variable estática, en ella almacenaremos la referencia
 * de la unica instancia que se creará durante la vida de la aplicación.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class ConfigurationSingleton {

	private static ConfigurationSingleton singleton;

	private static final String CONFIGURATION_PROPS = "META-INF/Configuration.properties";

	private static final String APP_NAME_PROPS = "appName";
	private static final String APP_VERSION_PROPS = "appVersion";

	private String appName;
	private String appVersion;

	private ConfigurationSingleton() {
		Properties prop = PropertiesUtil.load(CONFIGURATION_PROPS);
		this.appName = prop.getProperty(APP_NAME_PROPS);
		this.appVersion = prop.getProperty(APP_VERSION_PROPS);
	}

	private static synchronized void createInstance() {
		if (singleton == null) {
			singleton = new ConfigurationSingleton();
		}
	}

	public static ConfigurationSingleton getInstance() {
		if (singleton == null) {
			createInstance();
		}
		return singleton;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Override
	public String toString() {
		return "ConfigurationSingleton [appName=" + appName + ", appVersion=" + appVersion + "]";
	}
	
}
