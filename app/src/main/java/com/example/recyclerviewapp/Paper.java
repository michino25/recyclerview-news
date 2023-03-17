package com.example.recyclerviewapp;

import java.io.Serializable;

public class Paper implements Serializable {
    private int resourceId;
    private String topic;
    private String detail;

    public Paper(int resourceId, String topic, String detail) {
        this.resourceId = resourceId;
        this.topic = topic;
        this.detail = detail;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
