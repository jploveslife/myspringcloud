package com.jp;

/**
 * @Author: jipeng
 * @Description:
 * @Date: Created in 2019/4/6 9:50
 */
public class CountGC {

    public Object instance = null;

    public static void testGC(String[] args){
        //创建了一个CountGC对象，并发把它赋给了countGC1,CountGC的对象引用计数值加1
        CountGC countGC1 = new CountGC();
        //又创建了一个CountGC对象，并发把它赋给了countGC2,另一个CountGC的对象引用计数值加1
        CountGC countGC2 = new CountGC();

        //把第一个CountGC对象的instance字段赋值上第二个CountGC对象，第二个CountGC对象引用计数值再加1，这是就变成了2
        countGC1.instance = countGC2;
        //把第二个CountGC对象的instance字段赋值上第一个CountGC对象，第一个CountGC对象的引用计数值再加2，这时也变成了2
        countGC2.instance = countGC1;

        //countGC1赋空值，第一个CountGC对象引用减1
        countGC1 = null;
        //countGC2赋空值，第二个CountGC对象引用减1
        countGC2 = null;


        //如果这时候回收，这两个CountGC对象是无法回收的，因为他们的引用计数值不为0
        System.gc();
    }
}
