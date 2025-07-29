package com.xj.ojbackendjudgeservice.judge.codesandbox;

import com.xj.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xj.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
