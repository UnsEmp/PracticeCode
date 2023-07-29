package day05;

/**
 * 需求：从数组中所有元素中找出最大值
 *  int arr[] = {12,45,98,73,60};
 *
 *  需求：
 *      后台随机生成1-20之间的5个数(允许重复)，猜数字
 *      未猜中，提示"未命中"，并继续猜测
 *      猜中了，"猜中了"，输出该数据在数组中的第一次出现的位置，且输出全部5个数据，最终结束程序
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int arr[] = {12,45,98,73,60};
        int max = arr[0];//假设为最大值
        for (int i = 0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为" + max);

    }
}
