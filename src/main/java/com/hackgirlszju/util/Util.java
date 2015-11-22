package com.hackgirlszju.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sibylla on 15/11/21.
 */
public class Util {

    public static Map buildMap(Object... keyVals) {
        return buildMap((Map)null, keyVals);
    }

    public static Map buildMap(Map holder, Object... keyVals) {
        if(keyVals.length % 2 != 0) {
            throw new RuntimeException("参数为key1,val1,key2,val2...的形式,并且必须是偶数个参数!");
        } else {
            if(holder == null) {
                holder = new HashMap();
            }

            int i = 0;

            for(int n = keyVals.length / 2; i < n; ++i) {
                int k = i << 1;
                ((Map)holder).put(keyVals[k], keyVals[k + 1]);
            }

            return (Map)holder;
        }
    }
    public static boolean beforeNow(Date targetDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now = format.format(new java.util.Date());
        String targetTime = format.format(targetDate);
        if (targetTime.compareTo(now) < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean afterNow(Date targetDate) {

        return !beforeNow(targetDate);

    }

}
