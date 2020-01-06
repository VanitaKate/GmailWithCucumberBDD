package Configurations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ReadConfig {

	Logger logger=LogManager.getLogger();
	static Properties pro=new Properties();
	@SuppressWarnings("unused")
	public ReadConfig(){
		if (pro != null) {
			System.out.println("Pro is not null");
		}else {
			System.out.println("Pro is null");
		}
		try {
			File src=new File("./ConfigFiles/Configuration.properties");
			FileInputStream fis=new FileInputStream(src);
			//Properties pro=new Properties();
			if (fis !=null) {
				pro.load(fis);
			}else {
				System.out.println("Confifuration properties file not found.");
			}

		}catch(Exception e) {
			//			logger.info(e.getMessage());

		}

	}
	public static String getChromePath() {
		String chromePath=pro.getProperty("ChromePath");
		return chromePath;
	}
	public static String getFireFoxPath() {
		String fireFoxPath=pro.getProperty("FireFoxPath");
		return fireFoxPath;
	}
	public static String getIEPath() {
		String iePath=pro.getProperty("IEPath");
		return iePath;
	}
	public static String getUrl() {
		String URL=pro.getProperty("URL");
		return URL;
	}
}
