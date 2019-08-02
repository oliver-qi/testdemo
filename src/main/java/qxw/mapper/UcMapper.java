package qxw.mapper;

import org.apache.ibatis.annotations.Param;
import qxw.model.Uc;

public interface UcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Uc record);

    int insertSelective(Uc record);

    Uc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Uc record);

    int updateByPrimaryKey(Uc record);

    Uc getOne(@Param("uid") Integer uid, @Param("cid") Integer cid);
}