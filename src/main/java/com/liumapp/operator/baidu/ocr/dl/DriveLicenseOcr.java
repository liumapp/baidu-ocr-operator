package com.liumapp.operator.baidu.ocr.dl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import com.liumapp.operator.baidu.ocr.dl.require.DriveLicenseOcrRequire;
import com.liumapp.operator.baidu.ocr.job.JobDetail;

import java.io.IOException;
import java.util.HashMap;

/**
 * file DriveLicenseOcr.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class DriveLicenseOcr extends JobDetail<DriveLicenseOcrRequire> {

    public DriveLicenseOcr() throws IOException {
    }

    @Override
    public JSONObject handle(DriveLicenseOcrRequire data) {
        AipOcr client = new AipOcr(this.ocrConfig.getAppId(),
                this.ocrConfig.getAppKey(),
                this.ocrConfig.getAppSecret());

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");

        // 参数为本地路径
        org.json.JSONObject res = client.drivingLicense(data.getLicensePicPath(), options);

        return JSON.parseObject(res.toString());
    }

}
