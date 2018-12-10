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

    /**
     * 正确的返回结果:
     * {"log_id":35010630265653258,"words_result":{"姓名":{"words":"朱开拓"},"至":{"words":"20211016"},"证号":{"words":"320303199601034611"},"出生日期":{"words":"19960103"},"住址":{"words":"址江苏省徐州市泉山区亲爱巷108号"},"国籍":{"words":"中国"},"初次领证日期":{"words":"20151016"},"准驾车型":{"words":"C1"},"有效期限":{"words":"20151016"},"性别":{"words":"男"}},"words_result_num":10,"direction":0}
     * 错误的返回结果:
     * {"error_msg":"IAM Certification failed","error_code":14}
     */
    @Test
    public void testDriveLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        DriveLicenseOcr driveLicenseOcr = new DriveLicenseOcr();
        DriveLicenseOcrRequire driveLicenseOcrRequire = new DriveLicenseOcrRequire();
        driveLicenseOcrRequire.setLicensePicPath(dataPath + "/driveLicense01.jpg");
        JSONObject res = ocrOperator.doJob(driveLicenseOcr, driveLicenseOcrRequire);
        System.out.println(res.toJSONString());
    }


}
