package com.test.program.example.BeanutilTest;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

import java.util.concurrent.ConcurrentHashMap;


public class BeanutilTest {


    public static void main(String[] args) {

        PlatformConfigDTO platformConfigDTO = new PlatformConfigDTO();
        PlatformConfigInfo platformConfigInfo = PlatformConfigInfo.builder()
                .id(1)
                .merchantBackgroundImg("111")
                .merchantPlatformFavicon("111")
                .merchantPlatformLogo("111")
                .merchantPlatformName("111")
                .merchantPlatformTitle("111")
                .operationPlatformFavicon("111")
                .operationPlatformLogo("111")
                .operationPlatformName("11")
                .operationPlatformTitle("111")
                .operationBackgroundImg("111")
                .build();

        System.out.println(platformConfigInfo);

        BeanCopier copier = BeanCopier.create(PlatformConfigInfo.class, PlatformConfigDTO.class, false);
        copier.copy(platformConfigInfo, platformConfigDTO, null);

        System.out.println(platformConfigDTO);
    }



}
