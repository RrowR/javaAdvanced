package com.study;

public class Demo01Date {
    public static void main(String[] args) {
        /**
         * java.utiL.Date:表示日期和时间的类类Date表示特定的瞬间,精确到毫秒。毫秒:千分之一秒1000毫秒=1秒
         * 特定的瞬间:—个时间点,—刹那时间
         * 2088-08-08 09:55:33:333 瞬间
         * 2088-08-08 69:55:33:334瞬间
         * 2088-08-08 09:55:33:334瞬间...
         * 毫秒值的作用:可以对时间和日期进行计算
         * 2099-01-03到2088-01-01中间一共有多少天
         * 可以日期畤转专换为毫秒进行计算,计算完毕,在把毫秒转换为日期
         * 把日期转换为毫秒:
         * 当前的日期:2088-01-01
         * 时间原点(8毫秒):1970年1月1日00:00:00(英国格林威治)
         * 就是计算当前日期到时间原点之间一共经历了多少毫秒(3742767540868L )注意:
         * 中国属于东八区,会把时间增加8个小时1970年1月1日08:00:00
         * 把毫秒转换为日期:
         * 1天= 24 x 60 x 60 = 86400秒= 86400 x 1080 = 86400800毫秒
         */
//        显示系统当前时间
        System.out.println(System.currentTimeMillis());     //从1970年1月1日00：00：00到现在经历了多少毫秒
    }
}
