package com.liumapp.operator.baidu.ocr;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.dl.DriveLicenseOcr;
import com.liumapp.operator.baidu.ocr.dl.require.DriveLicenseOcrRequire;
import org.junit.Test;

import java.io.IOException;

/**
 * file DriveLicenseTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class DriveLicenseTest {

    private  String dataPath = "/usr/local/tomcat/project/baidu-ocr-operator/data/";

    @Test
    public void testBusinessLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        DriveLicenseOcr driveLicenseOcr = new DriveLicenseOcr();
        DriveLicenseOcrRequire driveLicenseOcrRequire = new DriveLicenseOcrRequire();
        driveLicenseOcrRequire.setLicensePicPath(dataPath + "/driveLicense01.jpg");
        JSONObject res = ocrOperator.doJob(driveLicenseOcr, driveLicenseOcrRequire);
        System.out.println(res.toJSONString());
    }


}
