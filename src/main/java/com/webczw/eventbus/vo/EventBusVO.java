package com.webczw.eventbus.vo;

import com.google.common.eventbus.EventBus;

public class EventBusVO {
    /**
     * 事件任务总线
     */
    private final static EventBus eventBus = new EventBus();

    /**
     * 触发同步事件
     *
     * @param event
     */
    public static void post(Object event) {
        eventBus.post(event);
    }

    /**
     * 注册事件处理器
     *
     * @param handler
     */
    public static void register(Object handler) {
        eventBus.register(handler);
    }

    /**
     * 注销事件处理器
     *
     * @param handler
     */
    public static void unregister(Object handler) {
        eventBus.unregister(handler);
    }
}
