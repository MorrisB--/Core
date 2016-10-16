package javaLog;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		
		LogManager logManager = LogManager.getLogManager();
		Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.log(Level.INFO, "Testing log messages");
		logger.log(Level.INFO, "Another message");
	}

}
