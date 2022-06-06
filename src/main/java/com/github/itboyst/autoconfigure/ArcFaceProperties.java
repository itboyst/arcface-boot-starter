package com.github.itboyst.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @author st7251
 * @date 2020/3/18 15:42
 */
@Data
@ConfigurationProperties(prefix = "arcface")
public class ArcFaceProperties {

    private boolean enableFaceEngine=true;

}
