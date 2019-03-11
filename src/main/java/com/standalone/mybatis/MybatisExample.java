package com.standalone.mybatis;

import com.mapper.ItemInfoMapper;
import com.model.Item;
import com.model.ItemInfo;
import com.model.ItemInfoExample;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * TODO mybatis单机调用，阅读源码
 * 2019/1/31 15:22
 */
public class MybatisExample {

    public static void main(String[] args) {
        MybatisExample m = new MybatisExample();
        //m.query();
        m.exampleQuery();
    }

    public void query(){
        Item itemvo = new Item();
        itemvo.setId(536563);
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Item item = sqlSession.selectOne("com.dao.ItemMapper.queryByItem",536563);
        System.out.println(item.toString());
    }

    public void exampleQuery(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ItemInfoMapper itemInfoMapper = sqlSession.getMapper(ItemInfoMapper.class);
        ItemInfoExample example = new ItemInfoExample();
        example.createCriteria().andIdEqualTo((long) 536563);
        List<ItemInfo> list = itemInfoMapper.selectByExample(example);
        System.out.println(list.get(0).getSellPoint());
    }

}
