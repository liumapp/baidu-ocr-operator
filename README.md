# baidu-ocr-operator
百度OCR接口操作工具类，不依赖第三方框架实现

## 如何使用

* Maven加载项目依赖

````mxml
<dependency>
    <groupId>com.liumapp.operator.baidu.ocr</groupId>
    <artifactId>baidu-ocr-operator</artifactId>
    <version>v1.0.2</version>
</dependency>
````

* 配置应用，在您的项目resources目录下创建一个baidu-ocr.yml文件（需要严格注意文件命名），并配置您的应用信息

````yaml
com:
  liumapp:
    baidu:
      ocr:
        appId: 'your app id here'
        appKey: 'your app key here'
        appSecret: 'your app secret here'
````


## 营业执照OCR

````java
OcrOperator ocrOperator = new OcrOperator();
BusinessLicenseOcr businessLicenseOcr = new BusinessLicenseOcr();
BusinessLicenseOcrRequire businessLicenseOcrRequire = new BusinessLicenseOcrRequire();
businessLicenseOcrRequire.setLicensePicPath(dataPath + "/businessLicense01.jpg");
JSONObject res = ocrOperator.doJob(businessLicenseOcr, businessLicenseOcrRequire);
System.out.println(res.toJSONString());
````

## 驾驶证OCR

````java
OcrOperator ocrOperator = new OcrOperator();
DriveLicenseOcr driveLicenseOcr = new DriveLicenseOcr();
DriveLicenseOcrRequire driveLicenseOcrRequire = new DriveLicenseOcrRequire();
driveLicenseOcrRequire.setLicensePicPath(dataPath + "/driveLicense01.jpg");
JSONObject res = ocrOperator.doJob(driveLicenseOcr, driveLicenseOcrRequire);
System.out.println(res.toJSONString());
````

## 行驶证OCR

````java
OcrOperator ocrOperator = new OcrOperator();
VehicleLicenseOcr vehicleLicenseOcr = new VehicleLicenseOcr();
VehicleLicenseOcrRequire vehicleLicenseOcrRequire = new VehicleLicenseOcrRequire();
vehicleLicenseOcrRequire.setLicensePicPath(dataPath + "/vehicleLicense01.jpg");
JSONObject res = ocrOperator.doJob(vehicleLicenseOcr, vehicleLicenseOcrRequire);
System.out.println(res);
````
