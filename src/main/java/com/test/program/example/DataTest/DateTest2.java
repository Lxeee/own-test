package com.test.program.example.DataTest;

import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest2 {
    public static void main(String[] args) {

//        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //获取当前时间作为endTime截至时间
//        Date todaydate = new Date();
//        String endTime =  format.format(todaydate);
//
//        Calendar c = Calendar.getInstance();
//
//        //过去九天的日期为起始日期
//        c.setTime(new Date());
//        c.add(Calendar.DATE, - 9);
//        Date d = c.getTime();
//        String day = format.format(d);
//
//        //获得该起止时间段的时间集
//        Set<String> dayset1 = null;
//        Set<String> dayset2 = null;

       // test3();

        Date date = new Date();
        Calendar c = Calendar.getInstance();

        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
//        String day = format.format(d);
//        System.out.println("过去七天："+day);
//        DateUtils.(date,);
//    findDates(new Date())


    }

    public static void test3() {

        Calendar begin = Calendar.getInstance();// 得到一个Calendar的实例
        begin.setTime(new Date()); // 设置时间为当前时间
        begin.add(Calendar.MONTH, -1);// 月份减1
        begin.add(Calendar.DATE, +1);// 日期加1

        Date result = begin.getTime();
        Calendar end = Calendar.getInstance();

        Long startTime = begin.getTimeInMillis();
        Long endTime = end.getTimeInMillis();
        Long oneDay = 1000 * 60 * 60 * 24L;// 一天的时间转化为ms
        List dates = new ArrayList<>();
        Long time = startTime;
        int i = 0;

        while (time <= endTime) {
            Date d = new Date(time);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dates.add(i, df.format(d));
            i++;
            time += oneDay;
        }



    }

    //JAVA获取某段时间内的所有日期
    public static List<Date> findDates(Date dStart, Date dEnd) {
        Calendar cStart = Calendar.getInstance();
        cStart.setTime(dStart);

        List dateList = new ArrayList();
        //别忘了，把起始日期加上
        dateList.add(dStart);
        // 此日期是否在指定日期之后
        while (dEnd.after(cStart.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cStart.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(cStart.getTime());
        }
        return dateList;
    }
}
