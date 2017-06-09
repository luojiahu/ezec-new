package com.xiaohu.ezec.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xiaohu.ezec.service.TestService;

@Service(value="testService")
public class TestServiceImpl implements TestService {

    @Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED, readOnly=false)
    public void testTransaction(Map<String, String> testMap) throws Exception {
        
        testMap.put("test", "child");
        changeMap(testMap);
        
        throw new Exception("Happy Children's day!");
    }
    
    private void changeMap(Map<String, String> mapToChange) {
        mapToChange.put("change", "adult");
    }

}
