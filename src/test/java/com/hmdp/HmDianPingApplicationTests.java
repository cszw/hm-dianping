package com.hmdp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class HmDianPingApplicationTests {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis(){
        stringRedisTemplate.opsForValue().set("ggg", "gggggg", 2, TimeUnit.SECONDS);
        String d = stringRedisTemplate.opsForValue().get("ggg");
        System.out.println(d);
    }

}
