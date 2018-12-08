package com.liumapp.operator.baidu.ocr.vl;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.job.JobDetail;
import com.liumapp.operator.baidu.ocr.vl.require.VehicleLicenseOcrRequire;

import java.io.IOException;

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

        return null;
    }
}
