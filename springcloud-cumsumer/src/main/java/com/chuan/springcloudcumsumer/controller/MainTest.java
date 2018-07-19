package com.chuan.springcloudcumsumer.controller;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @类名: MainTest
 * @包名: com.chuan.springcloudcumsumer.controller
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/6/8 11:37
 */
public class MainTest {
    public static void main(String[] args) throws IOException {
       /* URL resource = MainTest.class.getClassLoader().getResource("application.yml");
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.yml");
        StringBuffer str=new StringBuffer("");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
        char[] temp=new char[1024];
        while(bufferedReader.read(temp)!=-1){
            str.append(temp);
        }*/
        URL resource = MainTest.class.getClassLoader().getResource("");
        String path = resource.getPath();
        System.out.println(path);
    }
}
