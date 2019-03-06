package com.mapper;

import com.model.ItemInfo;
import com.model.ItemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemInfoMapper {
    long countByExample(ItemInfoExample example);

    int deleteByExample(ItemInfoExample example);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    List<ItemInfo> selectByExample(ItemInfoExample example);

    int updateByExampleSelective(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);

    int updateByExample(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);
}