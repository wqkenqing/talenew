package com.blogadmin.core.utils.json;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class SqlDateProcessor implements JsonValueProcessor {

    public Object processArrayValue(Object arg0, JsonConfig arg1) {
        return null;
    }

    public Object processObjectValue(String arg0, Object arg1, JsonConfig arg2) {
        return arg1 == null ? "" : "" + arg1 + "";
    }

}
