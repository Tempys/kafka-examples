package com.dubovskyi.kafka.streams;



import com.dubovskyi.kafka.onesignal.model.notification.NotificationRequest;

import java.io.Serializable;


public class NotificationEventDto implements Serializable {
    private  String uuid;
    private String  providerId;
    private NotificationRequest request;
    private String authkey;

    public NotificationEventDto() {
    }

    public NotificationEventDto(String uuid, String providerId, NotificationRequest request, String authkey) {
        this.uuid = uuid;
        this.providerId = providerId;
        this.request = request;
        this.authkey = authkey;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public NotificationRequest getRequest() {
        return request;
    }

    public void setRequest(NotificationRequest request) {
        this.request = request;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }
}
