package com.liumapp.operator.baidu.ocr.bl;

import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
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
public class BusinessLicenseOcr<T extends JobData> extends JobDetail<T> {

    public BusinessLicenseOcr() throws IOException {
    }

    @Override
    public JSONObject handle(T data) {
        AipOcr client = new AipOcr(this.ocrConfig.getAppId(),
                this.ocrConfig.getAppKey(),
                this.ocrConfig.getAppSecret());
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();


        // 参数为本地路径
        String image = dataPath + "/businessLicense01.jpg";
        org.json.JSONObject res = client.businessLicense(image, options);
        System.out.println(res.toString(2));

        // 参数为二进制数组
        byte[] file = readFile("test.jpg");
        res = client.businessLicense(file, options);
        System.out.println(res.toString(2));
    }

}
