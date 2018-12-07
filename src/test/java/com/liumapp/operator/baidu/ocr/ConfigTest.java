package com.liumapp.operator.baidu.ocr;

import com.liumapp.operator.baidu.ocr.config.OcrConfig;
import com.liumapp.qtools.property.core.ConfigurationNode;
import com.liumapp.qtools.property.core.loader.ConfigurationLoader;
import com.liumapp.qtools.property.yaml.YAMLConfigurationLoader;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

/**
 * file ConfigTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/12/7
 */
public class ConfigTest {

    @Test
    public void testRead () throws IOException {
        URL url = getClass().getResource("/baidu-ocr.yml");
        ConfigurationLoader loader = YAMLConfigurationLoader.builder()
                .setURL(url).build();
        ConfigurationNode node = loader.load();
        OcrConfig ocrConfig = new OcrConfig(
                node.getNode("com", "liumapp", "baidu", "ocr", "appId").getValue().toString(),
                node.getNode("com", "liumapp", "baidu", "ocr", "appKey").getValue().toString(),
                node.getNode("com", "liumapp", "baidu", "ocr", "appSecret").getValue().toString()
        );
        System.out.println(ocrConfig.toString());
    }

}
