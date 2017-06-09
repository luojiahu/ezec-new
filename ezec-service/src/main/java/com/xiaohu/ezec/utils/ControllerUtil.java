package com.xiaohu.ezec.utils;

import com.xiaohu.ezec.constants.Constant;
import com.xiaohu.ezec.model.ReturnMessage;

public class ControllerUtil {

    public static ReturnMessage failReturnMessage(String desc) {
        
        ReturnMessage retMsg = new ReturnMessage();
        
        retMsg.setCode(Constant.CONTROLLER_FAIL);
        retMsg.setDesc(desc);
        return retMsg;
    }

    public static ReturnMessage successReturnMessage(String desc) {
        ReturnMessage retMsg = new ReturnMessage();
        
        retMsg.setCode(Constant.CONTROLLER_SUCCESS);
        retMsg.setDesc(desc);
        return retMsg;
    }

}
