package com.github.itboyst.autoconfigure;

import org.junit.jupiter.api.Test;

/**
 * @author st7251
 * @date 2020/3/19 9:31
 */
public class ArcFaceAutoConfigurationTest {

//    @Test
    public void loadLibraryTest() throws Exception {
        ArcFaceAutoConfiguration arcFaceAutoConfiguration=new ArcFaceAutoConfiguration();

        arcFaceAutoConfiguration.afterPropertiesSet();


    }

}
