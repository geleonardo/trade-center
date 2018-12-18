package com.lmt.mbsp.trade.service;

import com.lmt.mbsp.trade.mapper.AbcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @Autowired
    private AbcMapper testMapper;

    public Long testSearch() {
        System.out.println();

//        return 1l;

        return testMapper.testSelect();
    }
}
