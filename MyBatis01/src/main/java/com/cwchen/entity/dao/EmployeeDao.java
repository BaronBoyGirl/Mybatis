package com.cwchen.entity.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class EmployeeDao {

    @Test
    public void test() throws IOException {
        // 加载mybatis 配置
        String file_properties = "conf/mybatis_config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(file_properties);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();
        Object o = sqlSession.selectOne("selectBlog", 1);
        System.out.println(o);
    }

}
