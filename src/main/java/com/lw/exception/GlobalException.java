package com.lw.exception;

import com.lw.result.CodeMsg;

/**
 * Created by 56321 on 2018/7/4.
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
