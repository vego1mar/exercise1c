package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter 
	{
	private static final Logger log = LogManager.getLogger();
	
	//____________________________________________________________________________________________________
	
    public int[] convertToInts( String [] strings ) {
    	String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
    	log.debug( methodName + "; strings={};", Arrays.toString(strings) );
        int [] result = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
        log.debug( methodName + " exiting; result={};", Arrays.toString(result) );
        return result;
    	}
    
    //____________________________________________________________________________________________________
    
	}
