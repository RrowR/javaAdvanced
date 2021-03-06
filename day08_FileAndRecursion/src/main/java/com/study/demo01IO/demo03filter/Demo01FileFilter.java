package com.study.demo01IO.demo03filter;

import java.io.File;
import java.io.FileFilter;

/**
 * File[] listFiles(FileFilter filter)
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *                   boolean accept(File pathname)
 *                   测试指定抽象路径名是否应该包含在某个路径名列表中。
 *  File[] listFiles(FilenameFilter filter)
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *                   boolean accept(File dir, String name)
 *                   测试指定文件是否应该包含在某一文件列表中。
 *  String[] list(FilenameFilter filter)
 *           返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 */
public class Demo01FileFilter {
    public static void main(String[] args) {
        File file = new File("F:\\abc");
        getAllFiles(file);
    }

    // 这个方法的目的是为了递归除全部文件
    public static void getAllFiles(File file){
        File[] files = file.listFiles(new FileFilterImpl());
        for (File f : files) {          // files 里面会包含文件夹
            if (f.isDirectory()){
                getAllFiles(f);         // 遍历出files里面的每一个file 包含文件或者文件夹，如果是一个文件夹，则继续递归，不打印
            }else {
                System.out.println(f);      // 打印出递归后的文件
            }
        }
    }
}
