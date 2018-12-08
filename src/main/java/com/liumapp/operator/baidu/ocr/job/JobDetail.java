package com.liumapp.operator.baidu.ocr.job;

import com.alibaba.fastjson.JSONObject;

/**
 * file JobDetail.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public abstract class JobDetail<T extends JobData> {

    protected JSONObject jobResult;

    public JobDetail() {
        this.jobResult = new JSONObject();
    }

    public abstract JSONObject handle(T data);

}
