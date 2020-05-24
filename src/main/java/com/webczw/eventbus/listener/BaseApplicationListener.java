package com.webczw.eventbus.listener;

import com.sun.istack.internal.logging.Logger;
import com.webczw.eventbus.vo.EventBusVO;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
abstract class BaseApplicationListener implements ApplicationListener<ApplicationStartedEvent> {
    private static Logger LOG = Logger.getLogger(BaseApplicationListener.class);
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationPreparedEvent) {
        ConfigurableApplicationContext applicationContext = applicationPreparedEvent.getApplicationContext();
        BaseApplicationListener bean = applicationContext.getBean(this.getClass());
        LOG.info("register listener to eventBus...."+bean);
        EventBusVO.register(bean);
    }
}
