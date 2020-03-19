package com.test.program.example.JsonTest;

import lombok.Data;

import java.util.List;

@Data
public class OrderList {


    /**
     * content : [{"taskId":"2e75319b102742189c6fa571a0d3f808","taskName":"测试任务","createTime":"2020-01-10 18:46:38","taskDesc":"测试任务","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"602e41a2b05e43a589f56bf5a810ba4f","taskName":"测试任务13","createTime":"2020-01-13 11:53:58","taskDesc":"测试任务13","channelId":"","channelName":"","taskStatus":3,"contractPath":""},{"taskId":"2aed88b6509347c490b892686c5e993b","taskName":"发点儿钱","createTime":"2020-01-13 15:00:25","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"03e616a9f6224736a2e595a333b13d68","taskName":"发点儿钱","createTime":"2020-01-13 15:00:30","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"17945a25a3ca4d5c86b07f69f92349dd","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"16cfb280026b452eb4ed73601f85f33b","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"71960ee0b0f245c7af8e1d7452d3a2db","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"a15c301d6fce4c79b99b1d6bbf4d3fe6","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"8df60e50d46b4f549a6fc2f31020bf9c","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""},{"taskId":"88cbfe4f154046bf924998f429f488a0","taskName":"发点儿钱","createTime":"2020-01-13 15:00:32","taskDesc":"没事儿就是想发点儿钱","channelId":"","channelName":"","taskStatus":1,"contractPath":""}]
     * pageNo : 1
     * pageSize : 10
     * totalCount : 15
     * hasMore : true
     */

    private int pageNo;
    private int pageSize;
    private int totalCount;
    private boolean hasMore;
    private List<ContentBean> content;

    public static class ContentBean {
        /**
         * taskId : 2e75319b102742189c6fa571a0d3f808
         * taskName : 测试任务
         * createTime : 2020-01-10 18:46:38
         * taskDesc : 测试任务
         * channelId :
         * channelName :
         * taskStatus : 1
         * contractPath :
         */

        private String taskId;
        private String taskName;
        private String createTime;
        private String taskDesc;
        private String channelId;
        private String channelName;
        private int taskStatus;
        private String contractPath;

    }
}
