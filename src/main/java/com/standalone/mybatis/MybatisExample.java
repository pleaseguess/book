package com.standalone.mybatis;

import com.model.Item;
import org.apache.ibatis.session.SqlSession;

/**
 * TODO mybatis单机调用，阅读源码
 * 2019/1/31 15:22
 */
public class MybatisExample {

    public static void main(String[] args) {
        MybatisExample m = new MybatisExample();
        m.query();
    }

    public void query(){
        Item itemvo = new Item();
        itemvo.setId(536563);
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Item item = sqlSession.selectOne("com.dao.ItemMapper.queryByItem",536563);
        System.out.println(item.toString());
    }

}
