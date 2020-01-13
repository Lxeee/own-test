package JsonTest;


import com.alibaba.fastjson.JSONObject;

public class test {

    public static void main(String[] args) {
        String message = " {\"memberID\":\"768570321605726831\",\"source\":{\"1030492136962781184\":10},\"curFollowNum\":172,\"maxFollowNum\":2000,\"leftFollowNum\":1828,\"type\":\"1\",\"followIDs\":\"1030492136962781184\",\"followSucc\":[{\"memberID\":\"103049213696278118423\",\"curMemberID\":\"768570321605726831\",\"followStatus\":1,\"isNewRelation\":1,\"isNewFollow\":1,\"isNewFans\":0,\"lastFollowTime\":\"2019-12-30 16:59:25\",\"lastFansTime\":\"2019-12-30 17:01:27\"}],\"followNew\":\"1030492136962781184\",\"isBatch\":1,\"followIdsFansLimitMap\":{\"1030492136962781184\":{\"fansNum\":2,\"maxFansNum\":2000,\"leftFansNum\":1998}}}   ";

        int index = message.indexOf("{");
        String msg = message.substring(index);
        System.out.println(msg);
        FollowFriendMqRespDTO followFriendMqRespDTO = JSONObject.parseObject(msg,FollowFriendMqRespDTO.class);
        System.out.println(followFriendMqRespDTO.getFollowSucc().get(0).getMemberID());

    }
}
