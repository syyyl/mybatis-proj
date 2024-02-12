
package com.ohgiraffers.common;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
    private static SqlSessionFactory sqlSessionFactory;

    public Template() {
    }

    public static SqlSession getSqlSession() {
        if (sqlSessionFactory == null) {
            String resource = "config/mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = (new SqlSessionFactoryBuilder()).build(inputStream);
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

        return sqlSessionFactory.openSession(false);
    }
}
