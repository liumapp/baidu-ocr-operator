package com.liumapp.operator.baidu.ocr.job;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.operator.baidu.ocr.config.OcrConfig;
import com.liumapp.qtools.property.core.ConfigurationNode;
import com.liumapp.qtools.property.core.loader.ConfigurationLoader;
import com.liumapp.qtools.property.yaml.YAMLConfigurationLoader;

import java.io.IOException;
import java.net.URL;

/**
 * file JobDetail.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/8
 */
public abstract class JobDetail<T extends JobData> {

    protected JSONObject jobResult;

    protected OcrConfig ocrConfig;

    public JobDetail() throws IOException {
        this.jobResult = new JSONObject();
        this.ocrConfig = this.buildOcrConfig();
    }

    public abstract JSONObject handle(T data);

    private OcrConfig buildOcrConfig () throws IOException {
        URL url = getClass().getResource("/baidu-ocr.yml");
        ConfigurationLoader loader = YAMLConfigurationLoader.builder()
                .setURL(url).build();
        ConfigurationNode node = loader.load();
        OcrConfig ocrConfig = new OcrConfig(
                node.getNode("com", "liumapp", "baidu", "ocr", "appId").getValue().toString(),
                node.getNode("com", "liumapp", "baidu", "ocr", "appKey").getValue().toString(),
                node.getNode("com", "liumapp", "baidu", "ocr", "appSecret").getValue().toString()
        );
        return ocrConfig;
    }
}
