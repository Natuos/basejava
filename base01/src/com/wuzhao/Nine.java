package com.wuzhao;

/**
 * @author : Natuos
 * @date : 2023-12-21 20:35
 * @Description打印九九乘法表
 **/
public class Nine {

    public static void main(String[] args) {
        for(int i = 1;i <=9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j+" * "+i+" = "+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
