package com.webczw.eventbus.controller;

import com.sun.istack.internal.logging.Logger;
import com.webczw.eventbus.vo.EventBusVO;
import com.webczw.eventbus.vo.MessageVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("event")
public class EventPublishCtrl {
    private static Logger LOG = Logger.getLogger(EventPublishCtrl.class);
    @GetMapping("/publish")
    public void publishEvent() {
        LOG.info("this publish method...");
        EventBusVO.post(new MessageVO(MessageVO.MessageType.OPEN_DOOR,"芝麻开门！"));
    }
}
