package com.liumapp.operator.baidu.ocr;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.dl.DriveLicenseOcr;
import com.liumapp.operator.baidu.ocr.dl.require.DriveLicenseOcrRequire;
import com.liumapp.operator.baidu.ocr.vl.VehicleLicenseOcr;
import com.liumapp.operator.baidu.ocr.vl.require.VehicleLicenseOcrRequire;
import com.liumapp.qtools.file.base64.Base64FileTool;
import org.junit.Test;

import java.io.IOException;

/**
 * file VehicleLicenseTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class VehicleLicenseTest {

    private  String dataPath = "/usr/local/tomcat/project/baidu-ocr-operator/data/";

    /**
     * 正确的返回结果:
     * {"log_id":2428878435417674250,"words_result":{"车辆识别代号":{"words":"LVVDB11B89D122246"},"住址":{"words":"武汉市青山区渝金30街6017号"},"品牌型号":{"words":"奇瑞牌SQR7160T116"},"发证日期":{"words":"20140413"},"车辆类型":{"words":"小型轿车"},"所有人":{"words":"白敏强"},"使用性质":{"words":"非营运"},"发动机号码":{"words":"FF9C13703"},"号牌号码":{"words":"鄂A8HB57"},"注册日期":{"words":"20090413"}},"words_result_num":10,"direction":0}
     * 错误的返回结果:
     * {"error_msg":"IAM Certification failed","error_code":14}
     */
    @Test
    public void testVehicleLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        VehicleLicenseOcr vehicleLicenseOcr = new VehicleLicenseOcr();
        VehicleLicenseOcrRequire vehicleLicenseOcrRequire = new VehicleLicenseOcrRequire();
        vehicleLicenseOcrRequire.setLicensePicPath(dataPath + "/vehicleLicense01.jpg");
        JSONObject res = ocrOperator.doJob(vehicleLicenseOcr, vehicleLicenseOcrRequire);
        System.out.println(res);
    }

    @Test
    public void testBase64VehicleLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        VehicleLicenseOcr vehicleLicenseOcr = new VehicleLicenseOcr();
        VehicleLicenseOcrRequire vehicleLicenseOcrRequire = new VehicleLicenseOcrRequire();
        vehicleLicenseOcrRequire.setBase64licensePic(Base64FileTool.filePathToBase64(dataPath + "/vehicleLicense01.jpg"));
        JSONObject res = ocrOperator.doJob(vehicleLicenseOcr, vehicleLicenseOcrRequire);
        System.out.println(res);
    }

}
