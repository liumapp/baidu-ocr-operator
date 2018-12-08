package com.liumapp.operator.baidu.ocr;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.job.JobData;
import com.liumapp.operator.baidu.ocr.job.JobDetail;

/**
 * file OcrOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/7
 */
public class OcrOperator {

    public JSONObject doJob(JobDetail jobDetail, JobData jobData) {
        return jobDetail.handle(jobData);
    }

}
