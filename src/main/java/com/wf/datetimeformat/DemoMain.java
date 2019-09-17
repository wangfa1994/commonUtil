package com.wf.datetimeformat;

import java.util.Date;

/**
 * @Author: wangfa
 * @Date: 2019/4/19 17:43
 * @Description:
 */
public class DemoMain {


    public static void main(String[] args) {
        // DateFormatUtils commonUtil中的日期类
        String format = DateTimeFormatUtil.dateFormat(new Date());
        System.out.println(format);
    }
}
