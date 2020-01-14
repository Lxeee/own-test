package RedisTest;

public class RedisTest {
    public static void main(String[] args) {
        RedisUtil redisUtil = RedisUtil.getRedisUtil();
        Long lockResult = redisUtil.setnx("1","1");
    }

}
