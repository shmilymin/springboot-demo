package com.mm.security.rsa;

import org.apache.commons.codec.binary.Hex;

/**
 * @author: shmily
 * @date: 2018/1/18 18:18
 **/
public class RSATest {
    private static String str = "shmily";
    public static void main(String[] args) {
        System.out.println("======================= JdkRSA数字签名 ========================");
        long date = System.currentTimeMillis();
        JdkRSA jdkRsa = new JdkRSA();
        byte[] sign = jdkRsa.sign(str.getBytes());
        System.out.println(new String(Hex.encodeHexString(sign)));
        boolean verify = jdkRsa.verify(str.getBytes(),sign);
        System.out.println(verify);
        long between = System.currentTimeMillis() - date;
        System.out.println("耗时："+ between);
    }
}
