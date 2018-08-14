package com.eureka.client.clientone.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String staffId;
    private String staffName;
    private String mobilePhone;

    private Date createTime;
    private Date updateTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" + "userId='" + userId + '\'' + ", staffId='" + staffId + '\'' + ", staffName='" + staffName + '\'' + ", mobilePhone='" + mobilePhone + '\'' + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
