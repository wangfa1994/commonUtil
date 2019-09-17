package com.wf.datetimeformat;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wangfa
 * @Date: 2019/4/17 10:25
 * @Description:
 */
public class DateTimeFormatUtil {

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String MONTH_PATTERN = "yyyy-MM";
    public static final String YEAR_PATTERN = "yyyy";
    public static final String MINUTE_ONLY_PATTERN = "mm";
    public static final String HOUR_ONLY_PATTERN = "HH";

    public static final long DAY_MILLI = 24 * 60 * 60 * 1000;

    /**
     *
     * @Author: wangfa
     * @Date: 2019/4/19 下午6:22
     * @Description: 日期格式化
     */
    public static String dateFormat(Date date){
        String format = DateFormatUtils.format(date, DATE_TIME_PATTERN);
        return format;
    }

    /**
     *
     * @Author: wangfa
     * @Date: 2019/4/19 下午6:23
     * @Description: 日期格式化
     */
    public static  String dateFormat(Date date,String pattern){
        if(StringUtils.isEmpty(pattern)){
            return dateFormat(date);
        }else{
           return DateFormatUtils.format(date,pattern);
        }

    }

    /**
     *
     * @Author: wangfa
     * @Date: 2019/4/19 下午6:25 
     * @Description: 计算 second 秒后的时间
     */
    public static Date addSecond(Date date,int second){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, second);
        return calendar.getTime();

    }
    


}
