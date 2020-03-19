package com.test.program.example.JsonTest;


import com.alibaba.fastjson.JSONObject;

public class test {

    public static void main(String[] args) {
//        String message = " {\"memberID\":\"768570321605726831\",\"source\":{\"1030492136962781184\":10},\"curFollowNum\":172,\"maxFollowNum\":2000,\"leftFollowNum\":1828,\"type\":\"1\",\"followIDs\":\"1030492136962781184\",\"followSucc\":[{\"memberID\":\"103049213696278118423\",\"curMemberID\":\"768570321605726831\",\"followStatus\":1,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"2019-12-30 16:59:25\",\"lastFansTime\":\"2019-12-30 17:01:27\"}],\"followNew\":\"1030492136962781184\",\"isBatch\":1,\"followIdsFansLimitMap\":{\"1030492136962781184\":{\"fansNum\":2,\"maxFansNum\":2000,\"leftFansNum\":1998}}}   ";
//        String message2 = "{{\"memberID\":\"1098563907905085443\",\"source\":{\"497032129595759543\":4,\"516724046831195400\":4,\"531266138217486726\":4,\"547390901202944955\":4,\"594225648147102525\":4},\"curFollowNum\":5,\"maxFollowNum\":2000,\"leftFollowNum\":1995,\"type\":1,\"followIDs\":\"497032129595759543,516724046831195400,531266138217486726,547390901202944955,594225648147102525\",\"followSucc\":[{\"memberID\":\"497032129595759543\",\"curMemberID\":\"1098563907905085443\",\"followStatus\":3,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"0000-00-00 00:00:00\",\"lastFansTime\":\"2020-02-25 11:00:46\"},{\"memberID\":\"516724046831195400\",\"curMemberID\":\"1098563907905085443\",\"followStatus\":3,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"0000-00-00 00:00:00\",\"lastFansTime\":\"2020-02-25 11:00:46\"},{\"memberID\":\"531266138217486726\",\"curMemberID\":\"1098563907905085443\",\"followStatus\":3,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"0000-00-00 00:00:00\",\"lastFansTime\":\"2020-02-25 11:00:46\"},{\"memberID\":\"547390901202944955\",\"curMemberID\":\"1098563907905085443\",\"followStatus\":3,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"0000-00-00 00:00:00\",\"lastFansTime\":\"2020-02-25 11:00:46\"},{\"memberID\":\"594225648147102525\",\"curMemberID\":\"1098563907905085443\",\"followStatus\":3,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"0000-00-00 00:00:00\",\"lastFansTime\":\"2020-02-25 11:00:46\"}],\"followNew\":\"497032129595759543,516724046831195400,531266138217486726,547390901202944955,594225648147102525\",\"isBatch\":1,\"followIdsFansLimitMap\":{\"497032129595759543\":{\"fansNum\":21,\"maxFansNum\":2000,\"leftFansNum\":1979},\"516724046831195400\":{\"fansNum\":5,\"maxFansNum\":2000,\"leftFansNum\":1995},\"531266138217486726\":{\"fansNum\":7,\"maxFansNum\":2000,\"leftFansNum\":1993},\"547390901202944955\":{\"fansNum\":3,\"maxFansNum\":2000,\"leftFansNum\":1997},\"594225648147102525\":{\"fansNum\":21,\"maxFansNum\":2000,\"leftFansNum\":1979}}";
//
//        System.out.println(message2);
//        int index = message2.indexOf("{");
//        String msg = message2.substring(index);
//        System.out.println(msg);
//        FollowFriendMqRespDTO followFriendMqRespDTO = JSONObject.parseObject(msg, FollowFriendMqRespDTO.class);
//        System.out.println(followFriendMqRespDTO.getFollowSucc().get(0).getMemberID());

        test();

    }



    public static void test() {
        String msg = "{\"data\":{\"content\":[{\"taskId\":\"2e75319b102742189c6fa571a0d3f808\",\"taskName\":\"测试任务\",\"createTime\":\"2020-01-10 18:46:38\",\"taskDesc\":\"测试任务\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"602e41a2b05e43a589f56bf5a810ba4f\",\"taskName\":\"测试任务13\",\"createTime\":\"2020-01-13 11:53:58\",\"taskDesc\":\"测试任务13\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":3,\"contractPath\":\"\"},{\"taskId\":\"2aed88b6509347c490b892686c5e993b\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:25\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"03e616a9f6224736a2e595a333b13d68\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:30\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"17945a25a3ca4d5c86b07f69f92349dd\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"16cfb280026b452eb4ed73601f85f33b\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"71960ee0b0f245c7af8e1d7452d3a2db\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"a15c301d6fce4c79b99b1d6bbf4d3fe6\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"8df60e50d46b4f549a6fc2f31020bf9c\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"},{\"taskId\":\"88cbfe4f154046bf924998f429f488a0\",\"taskName\":\"发点儿钱\",\"createTime\":\"2020-01-13 15:00:32\",\"taskDesc\":\"没事儿就是想发点儿钱\",\"channelId\":\"\",\"channelName\":\"\",\"taskStatus\":1,\"contractPath\":\"\"}],\"pageNo\":1,\"pageSize\":10,\"totalCount\":15,\"hasMore\":true},\"error\":{\"returnCode\":0,\"returnMessage\":\"SUCCESS\",\"returnUserMessage\":\"SUCCESS\"},\"info\":{\"serverIp\":\"10.1.93.5\",\"traceId\":\"114b7d2b6e3c46619729a10bea243758\"},\"success\":true}";

        JSONObject jsonObject = JSONObject.parseObject(msg);

        String data = jsonObject.getString("data");
        OrderList orderList1 = JSONObject.parseObject(data, OrderList.class);

//
//        Object obj = jsonObject.get("data");
//        OrderList orderList2 = (OrderList) obj;
//
//

        JSONObject jsonObject1 = jsonObject.getJSONObject("data");
        OrderList orderList3 = (OrderList) JSONObject.toJavaObject(jsonObject1,OrderList.class);


        System.out.println(orderList1);
        System.out.println(orderList3);

    }
}
