package com.liumapp.operator.baidu.ocr;

import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import com.liumapp.operator.baidu.ocr.bl.BusinessLicenseOcr;
import com.liumapp.operator.baidu.ocr.bl.require.BusinessLicenseOcrRequire;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * file BusinessLicenseTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/7
 */
public class BusinessLicenseTest {

    private  String dataPath = "/usr/local/tomcat/project/baidu-ocr-operator/data/";

    @Test
    public void testBusinessLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        BusinessLicenseOcr businessLicenseOcr = new BusinessLicenseOcr();
        BusinessLicenseOcrRequire businessLicenseOcrRequire = new BusinessLicenseOcrRequire();
        businessLicenseOcrRequire.setLicensePicPath(dataPath + "/businessLicense01.jpg");
        JSONObject res = ocrOperator.doJob(businessLicenseOcr, businessLicenseOcrRequire);
        System.out.println(res.toJSONString());
    }

}
