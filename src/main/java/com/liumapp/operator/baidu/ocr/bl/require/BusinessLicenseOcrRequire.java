package com.liumapp.operator.baidu.ocr.bl.require;

import com.liumapp.operator.baidu.ocr.job.JobData;

/**
 * file BusinessLicenseOcrRequire.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class BusinessLicenseOcrRequire extends JobData {

    private String licensePicPath;

    public BusinessLicenseOcrRequire() {
    }

    public BusinessLicenseOcrRequire(String licensePicPath) {
        this.licensePicPath = licensePicPath;
    }

    public String getLicensePicPath() {
        return licensePicPath;
    }

    public BusinessLicenseOcrRequire setLicensePicPath(String licensePicPath) {
        this.licensePicPath = licensePicPath;
        return this;
    }

    @Override
    public String toString() {
        return "BusinessLicenseOcrRequire{" +
                "licensePicPath='" + licensePicPath + '\'' +
                '}';
    }
}
