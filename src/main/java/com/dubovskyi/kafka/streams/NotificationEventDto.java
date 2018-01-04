package com.dubovskyi.kafka.streams;



import java.io.Serializable;


public class NotificationEventDto implements Serializable {
    private  String uuid;
    private String authkey;

    public NotificationEventDto() {
    }

    public NotificationEventDto(String uuid, String authkey) {
        this.uuid = uuid;
        this.authkey = authkey;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }
}
