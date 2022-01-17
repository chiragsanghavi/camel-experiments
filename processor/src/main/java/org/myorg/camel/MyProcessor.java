package org.myorg.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MyProcessor implements Processor {

    private static final Logger logger = LoggerFactory.getLogger(MyProcessor.class);
    public MyProcessor()
    {

    }
    @Override
    public void process(Exchange exchange)  {
        logger.trace("Processing for "+exchange.getExchangeId());

        String payload = exchange.getIn().getBody(String.class);
        // do something with the payload and/or exchange here
        exchange.getIn().setBody(payload+"X");
        exchange.getIn().setHeader("NewHeader","SampleValue");
    }
}
