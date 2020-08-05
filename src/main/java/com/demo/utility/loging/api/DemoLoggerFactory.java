package com.demo.utility.loging.api;

import com.demo.utility.loging.impl.DemoLoggerImpl;

import java.util.HashMap;
import java.util.Map;

public class DemoLoggerFactory {

    public static Map<Object,DemoLogger> loggerMap = new HashMap<Object, DemoLogger>();

    public static DemoLogger getLogger(Class<?> cls){
        if (!loggerMap.containsKey(cls)){
            loggerMap.put(cls,new DemoLoggerImpl(cls));
        }
        return loggerMap.get(cls);
    }

}
