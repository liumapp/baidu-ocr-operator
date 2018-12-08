package com.liumapp.operator.baidu.ocr.bl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import com.liumapp.operator.baidu.ocr.bl.require.BusinessLicenseOcrRequire;
import com.liumapp.operator.baidu.ocr.job.JobData;
import com.liumapp.operator.baidu.ocr.job.JobDetail;

import java.io.IOException;
import java.util.HashMap;

/**
 * file BusinessLicenseOcr.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class BusinessLicenseOcr extends JobDetail<BusinessLicenseOcrRequire> {

    public BusinessLicenseOcr() throws IOException {
    }

    @Override
    public JSONObject handle(BusinessLicenseOcrRequire data) {
        AipOcr client = new AipOcr(this.ocrConfig.getAppId(),
                this.ocrConfig.getAppKey(),
                this.ocrConfig.getAppSecret());
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        // 参数为本地路径
        org.json.JSONObject res = client.businessLicense(data.getLicensePicPath(), options);
        System.out.println(res.toString(2));

        return JSON.parseObject(res.toString());
    }

}
