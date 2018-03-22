package de.holisticon.camunda.example.tenant;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PrintWordDelegate implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrintWordDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) {
        LOGGER.info("digit_word: {}", delegateExecution.getVariable("digit_word"));
    }
}
