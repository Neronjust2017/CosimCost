package com.njust.utils;

import java.util.Date;

/**
 * @author tomato
 * @create 2018-04-10 下午5:36
 */
public class TwoDate {
    private Date startTme;
    private Date endTime;

    public TwoDate() throws Exception {
        startTme = TimeUtil.dateFormat("1990-01-01 00:00:00");
        endTime = TimeUtil.dateFormat("2999-12-30 00:00:00");
    }

    public Date getStartTme() {
        return startTme;
    }

    public void setStartTme(Date startTme) {
        this.startTme = startTme;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
