package com.liumapp.operator.baidu.ocr.vl.require;

import com.liumapp.operator.baidu.ocr.job.JobData;

/**
 * file VehicleLicenseOcrRequire.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class VehicleLicenseOcrRequire extends JobData {

    private String licensePicPath;

    public VehicleLicenseOcrRequire() {
    }

    public VehicleLicenseOcrRequire(String licensePicPath) {
        this.licensePicPath = licensePicPath;
    }

    public String getLicensePicPath() {
        return licensePicPath;
    }

    public VehicleLicenseOcrRequire setLicensePicPath(String licensePicPath) {
        this.licensePicPath = licensePicPath;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleLicenseOcrRequire{" +
                "licensePicPath='" + licensePicPath + '\'' +
                '}';
    }
}
