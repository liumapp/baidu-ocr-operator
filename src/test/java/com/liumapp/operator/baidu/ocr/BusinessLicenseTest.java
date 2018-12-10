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

    /**
     * 正确的返回结果：
     * {"log_id":8974927659197287210,"words_result":{"社会信用代码":{"words":"无","location":{"top":0,"left":0,"width":0,"height":0}},"组成形式":{"words":"无","location":{"top":0,"left":0,"width":0,"height":0}},"法人":{"words":"魏景好","location":{"top":394,"left":231,"width":50,"height":23}},"成立日期":{"words":"无","location":{"top":0,"left":0,"width":0,"height":0}},"注册资本":{"words":"10万元","location":{"top":398,"left":721,"width":22,"height":24}},"证件编号":{"words":"320705000019915","location":{"top":289,"left":720,"width":136,"height":14}},"地址":{"words":"连云港市新浦区建国路1512号","location":{"top":359,"left":230,"width":229,"height":21}},"单位名称":{"words":"连云港戎禹新型防水材料有限公司","location":{"top":323,"left":229,"width":269,"height":23}},"类型":{"words":"有限公司(自然人独资)","location":{"top":432,"left":231,"width":187,"height":20}},"有效期":{"words":"2008年10月19日","location":{"top":643,"left":379,"width":128,"height":18}}},"words_result_num":10,"direction":0}
     * 错误的返回结果:
     * {"error_msg":"IAM Certification failed","error_code":14}
     * @throws IOException
     */
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
