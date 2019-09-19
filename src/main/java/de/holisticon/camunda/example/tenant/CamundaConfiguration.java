package de.holisticon.camunda.example.tenant;

import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.util.SpringBootProcessEnginePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jo Ehm (Holisticon)
 */
@Configuration
public class CamundaConfiguration {

    @Bean
    public ProcessEnginePlugin processEnginePlugin() {
        return new SpringBootProcessEnginePlugin() {

            @Override
            public void preInit(SpringProcessEngineConfiguration processEngineConfiguration) {
                processEngineConfiguration.setTenantIdProvider(new AuthenticatedUserTenantIdProvider());
            }
        };
    }
}
