package com.dashboard.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

public class ServerStat {
    private String hostName;
    private String hostStatus;

    public ServerStat() {
    		super();
    }

    public ServerStat(String hostName, String hostStatus, String hostUpTime, String processStatus, String processUpTime) {
        super();
        this.hostName= hostName;
        this.hostStatus = hostStatus;
        this.hostUpTime = hostUpTime;
        this.processStatus = processStatus;
        this.processUpTime = processUpTime;
    }

    public String getHostName() {
        return hostName;
    }

    // public void setHostName(String hostName) {
    //     this.hostName = hostName;
    // }

    public String getHostStatus() {
        return hostStatus;
    }

    // public void setHostStatus(String hostStatus) {
    //   this.hostStatus = hostStatus;
    // }

    public String getHostUpTime() {
        return hostUpTime;
    }

    // public void setHostUpTime(String hostUpTime) {
    //   this.hostUpTime = hostUpTime;
    // }

    public String getHostUpTime() {
        return hostUpTime;
    }

    // public void setHostUpTime(String hostUpTime) {
    //   this.hostUpTime = hostUpTime;
    // }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + id;
    //     return result;
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ServerStat other = (ServerStat) obj;
        if (hostName != other.hostName) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "ServerStat [hostName=%s, hostStatus=%s]", hostName, hostStatus);
    }

}
