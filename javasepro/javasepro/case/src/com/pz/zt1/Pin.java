package com.pz.zt1;

import java.util.Random;

public class Pin {
    public static void main(String[] args) {
//       3. 随机产生的五位验证码，每位可能是数字，大写字母，小写字母
        System.out.println(createCode(5));
    }

//    1.定义一个方法，返回一个随机验证码
    public static String createCode(int n){
        String code = "";
        Random r = new Random();

//        2.定义一个for循环，循环n次，依次随机生成字符
        for (int i = 1; i <=n; i++) {
            int flag = r.nextInt(3);
            switch(flag){
                case 0:
                    code += (char) (r.nextInt(26)+65);;break;//注意！！！！！！！！！！！！！总是忘记break;
                case 1:
                    code += (char) (r.nextInt(26)+97);break;
                case 2:
                    code += r.nextInt(10);break;//错误点：不能盲目强制转换，要看具体要求
                default:
                    System.out.println("随机有误！！！");

            }
        }
        return code;

    }

}
