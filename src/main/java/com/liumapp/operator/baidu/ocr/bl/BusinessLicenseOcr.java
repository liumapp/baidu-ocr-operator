package com.liumapp.operator.baidu.ocr.bl;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.job.JobData;
import com.liumapp.operator.baidu.ocr.job.JobDetail;

/**
 * file BusinessLicenseOcr.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class BusinessLicenseOcr<T extends JobData> extends JobDetail<T> {

    @Override
    public JSONObject handle(T data) {
        return null;
    }

}
