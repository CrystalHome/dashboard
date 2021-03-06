package cn.crystal.dashboard.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Crystal-Chen
 * @Title: DateUtils
 * @Package cn.crystal.dashboard.utils
 * @Description: 日期工具类
 * @date 2019/12/14 19:39
 */
public class DateUtils {

    public static final String PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
    * @Description: 获取当前时间:yyyy-MM-dd HH:mm:ss
    */
    public static String getCurrentDateString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_YYYY_MM_DD_HH_MM_SS);
        Date date = new Date(System.currentTimeMillis());
        String currentTimeString = simpleDateFormat.format(date);
        return currentTimeString;
    }

}
