package com.demo.utility.loging.impl;

import com.demo.utility.loging.api.DemoLogger;
import com.demo.utility.loging.api.LoggerAdapter;

public class DemoLoggerImpl extends LoggerAdapter implements DemoLogger {

    public DemoLoggerImpl(Class<?> cls) {
        super(cls);
    }

}
