package com.lw.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by 56321 on 2018/7/4.
 */
@Service
public class RedisService {
    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private JedisPool jedisPool;
    public <T>T get(String key , Class<T> clazz){
        Jedis jedis = jedisPool.getResource();
        return null;
    }

    @Bean
    public JedisPool jedisPoolFactory(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisConfig.getPoolMaxIdle());
        jedisPoolConfig.setMaxTotal(redisConfig.getPoolMaxTotal());
        jedisPoolConfig.setMaxWaitMillis(redisConfig.getPoolMaxWait()*1000);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig,redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout()*1000,redisConfig.getPassword(),0);
        return jedisPool;
    }
}
