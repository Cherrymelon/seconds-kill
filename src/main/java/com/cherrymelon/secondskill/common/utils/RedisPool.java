package com.cherrymelon.secondskill.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author cherrymelon
 * @date 4/19 17:40
 */
@Component
public class RedisPool {

    private static JedisPool pool;
//    @Value("${spring.redis.maxTotal}")
    private static Integer maxTotal=300;
//    @Value("${spring.redis.maxIdle}")
    private static Integer maxIdle=100;
//    @Value("${spring.redis.maxWait}")
    private static Integer maxWait=10000;
//    @Value("${spring.redis.testOnBorrow}")
    private static Boolean testOnBorrow=true;
//    @Value("${spring.redis.redisIP}")
    private static String redisIP="127.0.0.1";
//    @Value("${spring.redis.redisPort}")
    private static Integer redisPort=6380;

    private static void initPool() {
        JedisPoolConfig config = new JedisPoolConfig();

        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setTestOnBorrow(testOnBorrow);
        config.setBlockWhenExhausted(true);
        config.setMaxWaitMillis(maxWait);

        pool = new JedisPool(config, redisIP, redisPort, 1000 * 2);
    }

    // 类加载到 jvm 时直接初始化连接池
    static {
        initPool();
    }

    public static Jedis getJedis() {
        return pool.getResource();
    }

    public static void jedisPoolClose(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }
}
