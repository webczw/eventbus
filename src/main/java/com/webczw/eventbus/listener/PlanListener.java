package com.webczw.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import com.sun.istack.internal.logging.Logger;
import com.webczw.eventbus.vo.MessageVO;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PlanListener extends BaseApplicationListener {
    private static Logger LOG = Logger.getLogger(PlanListener.class);
    @Subscribe
    public void on(MessageVO msg) throws Exception {
        LOG.info("plan msg->  messageType：" + msg.getMessageType() + " messageContent：" + msg.getMessageContent());
         // throw new Exception("-67890");
    }
}
