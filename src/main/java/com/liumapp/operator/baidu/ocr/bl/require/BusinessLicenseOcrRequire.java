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

    private String base64LicensePic;

    public BusinessLicenseOcrRequire() {
    }

    public BusinessLicenseOcrRequire(String licensePicPath, String base64LicensePic) {
        this.licensePicPath = licensePicPath;
        this.base64LicensePic = base64LicensePic;
    }

    public String getBase64LicensePic() {
        return base64LicensePic;
    }

    public BusinessLicenseOcrRequire setBase64LicensePic(String base64LicensePic) {
        this.base64LicensePic = base64LicensePic;
        return this;
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
                ", base64LicensePic='" + base64LicensePic + '\'' +
                '}';
    }
}
