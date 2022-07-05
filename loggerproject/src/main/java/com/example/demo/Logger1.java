package com.example.demo;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Logger1 {
	
	
	
	private static Logger  logger=Logger.getLogger(Logger1.class);	

	public static void main(String[] args) throws IOException {
		
		
		logger.info("info msg");
		logger.debug("debug msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.fatal("fatal msg");
	}

}
