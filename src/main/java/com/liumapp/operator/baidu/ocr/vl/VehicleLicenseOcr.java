package com.liumapp.operator.baidu.ocr.vl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import com.liumapp.operator.baidu.ocr.job.JobDetail;
import com.liumapp.operator.baidu.ocr.vl.require.VehicleLicenseOcrRequire;

import java.io.IOException;
import java.util.HashMap;

/**
 * file VehicleLicenseOcr.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class VehicleLicenseOcr extends JobDetail<VehicleLicenseOcrRequire> {

    public VehicleLicenseOcr() throws IOException {
    }

    @Override
    public JSONObject handle(VehicleLicenseOcrRequire data) {
        AipOcr client = new AipOcr(this.ocrConfig.getAppId(),
                this.ocrConfig.getAppKey(),
                this.ocrConfig.getAppSecret());
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("accuracy", "normal");

        // 参数为本地路径
        org.json.JSONObject res = client.vehicleLicense(data.getLicensePicPath(), options);
        System.out.println(res.toString(2));
        return JSON.parseObject(res.toString());
    }
}
