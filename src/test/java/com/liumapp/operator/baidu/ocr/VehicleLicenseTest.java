package com.liumapp.operator.baidu.ocr;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.dl.DriveLicenseOcr;
import com.liumapp.operator.baidu.ocr.dl.require.DriveLicenseOcrRequire;
import com.liumapp.operator.baidu.ocr.vl.VehicleLicenseOcr;
import com.liumapp.operator.baidu.ocr.vl.require.VehicleLicenseOcrRequire;
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

    @Test
    public void testVehicleLicense () throws IOException {
        OcrOperator ocrOperator = new OcrOperator();
        VehicleLicenseOcr vehicleLicenseOcr = new VehicleLicenseOcr();
        VehicleLicenseOcrRequire vehicleLicenseOcrRequire = new VehicleLicenseOcrRequire();
        vehicleLicenseOcrRequire.setLicensePicPath(dataPath + "/vehicleLicense01.jpg");
        JSONObject res = ocrOperator.doJob(vehicleLicenseOcr, vehicleLicenseOcrRequire);
        System.out.println(res);
    }

}
