package com.test.program.example.BeanutilTest;

import lombok.Data;

/**
 */
@Data
public class PlatformConfigDTO {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 运营平台名称
     */
    private String operationPlatformName;

    /**
     * 运营平台标题
     */
    private String operationPlatformTitle;

    /**
     * 运营平台背景图
     */
    private String operationBackgroundImg;

    /**
     * 运营平台logo
     */
    private String operationPlatformLogo;

    /**
     * 运营平台favicon.ico
     */
    private String operationPlatformFavicon;

    /**
     * 商户平台名称
     */
    private String merchantPlatformName;

    /**
     * 商户平台标题
     */
    private String merchantPlatformTitle;

    /**
     * 商户平台背景图
     */
    private String merchantBackgroundImg;

    /**
     * 商户平台logo
     */
    private String merchantPlatformLogo;

    /**
     * 商户平台favicon.ico
     */
    private String merchantPlatformFavicon;


}
