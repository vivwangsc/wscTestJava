package com.example.wsctestjava;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//todo:js脚本引擎的调试与测试对于各种环境的执行
//todo:mybatis-plus的数据库读写与输出，熟练掌握，尽量不用sql语句
//todo:一个简单的web客户端页面的数据库crud

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WscTestJavaApplication.class)
class WscTestJavaApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void test1()
    {
        String s = """
                this is a very
                interstirg 
                of the something;
                """;
        String script = "SELECT * FROM sys_oper_log";
//        System.out.println(s);
        var list = jdbcTemplate.queryForList(script);
        list.forEach(item -> System.out.println(item));
        System.out.println(list);
    }

}
