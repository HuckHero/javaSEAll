package com.zhaoxin.javaAll.javaLearning.ClassLoad;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        Properties properties =new Properties();
        InputStream rs = classLoader.getResourceAsStream("jdbc.properties");
//        FileInputStream fis =new FileInputStream("jdbc.properties");
        properties.load(rs);
        String user = properties.getProperty("user");
        String username = properties.getProperty("username");
        System.out.println(user+username);
    }
}
