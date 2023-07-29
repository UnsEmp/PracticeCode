package day03;


/*
    流程控制语句:通过一些语句，来控制程序的执行流程
    分类:
        顿序结构(默认，从上到下，从左到右)
        分支结构/选择结构(if,switch)
        循环结构(for,while,do..while)

     分支结构
        if语句
            格式1:
                if(关系表达式){
                    语句体：
                }
*/

import javafx.scene.transform.ShearBuilder;

public class IfDemo {
    public static void main(String[] args) {
        //需求: 心跳 60 - 100 是正常的，否则系统提示
        int hearBeat = 90;
        if(hearBeat < 60 || hearBeat > 100) {
            System.out.println("您的心跳数据是: " + hearBeat + "可能需要进一步检查");
        }
        // System.out.println("心跳正常，进行其他项目的检查");
        System.out.println("over");
    }
}
