package com.guzt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main( String[] args )
    {
        App app = new App();
        app.logger.debug("输出debug级别的日志.....{}","变量占位符");
        app.logger.info("输出info级别的日志.....");
        app.logger.error("输出error级别的日志.....");
    }
}
