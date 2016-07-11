/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp;

/**
 *
 * @author peteh
 */
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;

// TRACE < DEBUG < INFO < WARN < ERROR < FATAL
        
public class LogIt {
    private static final Logger logger = LogManager.getLogger(LogIt.class);
    
    public void logTrace(String msg) {
        // In order to access a logger other than 'root', the LogManager
        // must be told to getLogger("loggerName")
        Logger consoleLogger = LogManager.getLogger("TraceASPS");
        consoleLogger.trace(msg);
//        logger.trace(msg);
    }
    public void logDebug(String msg) {
        logger.debug(msg);
    }
    public void logInfo(String msg) {
        logger.info(msg);
    }
    public void logWarn(String msg) {
        logger.warn(msg);
    }
    public void logError(String msg) {
        logger.error(msg);
    }
    public void logFatal(String msg) {
        logger.fatal(msg);
    }
    
    
}
