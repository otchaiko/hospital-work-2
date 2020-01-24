package com.solvd.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SqlExecutor {

    public static AddressMapper getAddressMapper() {
        SqlSessionFactory sqlSessionFactory;
        AddressMapper addressMapper = null;
        Reader reader;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            addressMapper = sqlSessionFactory.openSession().getMapper(AddressMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return addressMapper;
    }

    public static RestaurantMapper getRestaurantMapper() {
        SqlSessionFactory sqlSessionFactory;
        RestaurantMapper restaurantMapper = null;
        Reader reader;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            restaurantMapper = sqlSessionFactory.openSession().getMapper(RestaurantMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return restaurantMapper;
    }
}
