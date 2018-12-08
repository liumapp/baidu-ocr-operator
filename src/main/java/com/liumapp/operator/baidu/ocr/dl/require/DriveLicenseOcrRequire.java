package com.liumapp.operator.baidu.ocr.dl.require;

import com.liumapp.operator.baidu.ocr.job.JobData;

/**
 * file DriveLicenseOcrRequire.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public class DriveLicenseOcrRequire extends JobData {

    private String licensePicPath;

    public DriveLicenseOcrRequire() {
    }

    public DriveLicenseOcrRequire(String licensePicPath) {
        this.licensePicPath = licensePicPath;
    }

    public String getLicensePicPath() {
        return licensePicPath;
    }

    public DriveLicenseOcrRequire setLicensePicPath(String licensePicPath) {
        this.licensePicPath = licensePicPath;
        return this;
    }

    @Override
    public String toString() {
        return "DriveLicenseOcrRequire{" +
                "licensePicPath='" + licensePicPath + '\'' +
                '}';
    }
}
