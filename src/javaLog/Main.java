package javaLog;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {

		logger.setLevel(Level.INFO);
		logger.severe("Severe message");
		logger.info("Info level message");
		logger.fine("Should not be seeing this message");

	}
	
	public static void doingSomething() {
		logger.setLevel(Level.ALL);
		logger.entering("javalog.Main", "doingSomething()");
		logger.logp(Level.WARNING, "javalog.Main", "doingSomething()", "This method is not doing anything");
		logger.exiting("javaLog.Main", "doingSomething()");
	}

}
