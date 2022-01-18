package org.myorg.camel;

import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMainApp {
    private static final Logger logger = LoggerFactory.getLogger(MyMainApp.class);

    public static void main(String[] args) throws Exception {

        logger.debug("Starting main app");

        //creating main app to run in commandline
        Main main = new Main();

        //start running main
        main.run(args);

    }
}
