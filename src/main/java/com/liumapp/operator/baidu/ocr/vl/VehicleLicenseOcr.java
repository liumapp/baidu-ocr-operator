package com.liumapp.operator.baidu.ocr.vl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.aip.ocr.AipOcr;
import com.liumapp.operator.baidu.ocr.job.JobDetail;
import com.liumapp.operator.baidu.ocr.vl.require.VehicleLicenseOcrRequire;
import com.liumapp.qtools.file.base64.Base64FileTool;
import com.liumapp.qtools.file.binary.BinaryFileTool;
import com.liumapp.qtools.str.basic.StrTool;

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

        org.json.JSONObject res = null;
        if (StrTool.isSpace(data.getLicensePicPath())) {
            //参数为Base64
            String base64 = Base64FileTool.removeBase64Header(data.getBase64licensePic());
            res = client.vehicleLicense(BinaryFileTool.Base64ToBinaryBytes(base64), options);
        } else {
            // 参数为本地路径
            res = client.vehicleLicense(data.getLicensePicPath(), options);
        }
        return JSON.parseObject(res.toString());
    }
}
