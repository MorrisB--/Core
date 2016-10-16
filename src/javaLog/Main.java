package javaLog;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {

		logger.setLevel(Level.INFO);
		logger.log(Level.SEVERE, "Severe message");
		logger.log(Level.INFO, "Info level message");
		logger.log(Level.FINE, "Should not be seeing this message");

	}

}
