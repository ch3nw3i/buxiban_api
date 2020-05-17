package com.buxiban.common.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;
import com.google.code.kaptcha.util.ConfigHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Package: com.buxiban.common.config
 * @Author: ch3nw3i@github
 * @Date: 2020-05-16 21:26
 */
@Configuration
public class KaptchaConfig {

    @Bean
    public Producer KaptchaProducer() {
        Properties properties = new Properties();
        properties.put("kaptcha.border", "no");
        properties.put("kaptcha.textproducer.char.length", "4");
        properties.put("kaptcha.image.height", "50");
        properties.put("kaptcha.image.width", "150");
        properties.put("kaptcha.obscurificator.impl", "com.github.penggle.kaptcha.impl.ShadowGimpy");
        properties.put("kaptcha.textproducer.font.coler", "black");
        properties.put("kaptcha.textproducer.font.size", "40");
        properties.put("kaptcha.noise.impl", "com.github.penggle.kaptcha.impl.NoNoise");
        properties.put("kaptcha.textproducer.char.string", "acdefhkmnprwxy2345678");

        Config config = new Config(properties);
        return config.getProducerImpl();

    }
}
