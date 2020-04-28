package com.buxiban.test;

import cn.hutool.core.bean.BeanUtil;
import com.buxiban.org.entity.Org;
import com.buxiban.org.entity.dto.OrgDto;
import org.junit.Test;
//import org.springframework.beans.BeanUtils;

/**
 * @Package: com.buxiban.test
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 23:17
 */
public class BeanUtilsTest {

    @Test
    public void dtoToPo() {
        OrgDto orgDto = new OrgDto();
        orgDto.setName("name1111");
        orgDto.setOrgCode("code222");
        orgDto.setDescription("desc3333");
        orgDto.setPrincipalUserId(1);
        System.out.println(orgDto);
        Org org = new Org();
        BeanUtil.copyProperties(orgDto, org);
        System.out.println(org);
    }
}
