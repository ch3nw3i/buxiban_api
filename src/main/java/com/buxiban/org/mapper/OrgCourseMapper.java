package com.buxiban.org.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.org.entity.OrgCourse;
import com.buxiban.org.entity.OrgUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.buxiban.org.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:42
 */
@Mapper
@Repository
public interface OrgCourseMapper extends BaseMapper<OrgCourse> {

}
