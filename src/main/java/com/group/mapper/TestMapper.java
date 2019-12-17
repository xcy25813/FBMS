package com.group.mapper;

import com.group.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    List<Test> selectUsers();
}
