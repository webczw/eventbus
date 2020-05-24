package com.webczw.eventbus.vo;

public class MessageVO {
    private MessageType messageType;
    private String messageContent;

    public MessageVO(MessageType messageType, String messageContent) {
        this.messageType = messageType;
        this.messageContent = messageContent;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public enum MessageType {
        OPEN_DOOR(1, "openDoor"),
        CLOSE_DOOR(2, "closeDoor");
        private int code;
        private String value;

        MessageType(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
