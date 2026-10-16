package com.ormawa.uts_rpll_shofwatunnisa_121.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("helloWorldDelegate")
public class HelloWorldDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger(HelloWorldDelegate.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("==================================================");
        LOGGER.info(" SUCCESS: TEST HELLO WORLD CAMUNDA 7 BERHASIL!");
        LOGGER.info("==================================================");
    }
}