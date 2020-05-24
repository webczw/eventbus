package com.webczw.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import com.sun.istack.internal.logging.Logger;
import com.webczw.eventbus.vo.MessageVO;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class SubscribeListener extends BaseApplicationListener {
    private static Logger LOG = Logger.getLogger(SubscribeListener.class);
    @Subscribe
    public void on(MessageVO msg) {
        LOG.info("subscribe msg->  messageType：" + msg.getMessageType() + " messageContent：" + msg.getMessageContent());
    }
}
