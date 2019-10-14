package com.lpl;

import java.io.File;

/**
 * @author 路常寻走不
 * @version 1.0
 * @date 2019/10/12 0012
 */
public class Demo01 {
    public static void main(String[] args) {
        File file = new File("E:\\file01");
        fileWay(file);
    }

    /*文件夹的递归遍历*/
    public static void fileWay(File file) {
        if (file.isDirectory()) {
            File fileArray[] = file.listFiles();
            if (fileArray != null || fileArray.length > 0) {
                for (int i = 0; i <fileArray.length ; i++) {
                    if (fileArray[i].isFile()) {
                        System.out.println(fileArray[i].getName());
                    }
                    fileWay(fileArray[i]);
                }
            }

        }
    }
}
