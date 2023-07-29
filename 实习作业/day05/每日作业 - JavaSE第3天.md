# 数组



## 题目1（训练）

请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：

```
数组为：{1,2,3,4,5}
打印结果：1 2 3 4 5 
```

### 训练提示

1、数组中的元素有索引，开始索引和结束索引分别是什么？使用循环语句，依次通过索引获取元素即可遍历数组。

2、在打印数组元素时，是以空格分隔，并且不换行，该怎样输出？

### 解题方案

for循环遍历数组

### 操作步骤

1、定义int数组，使用静态初始化方式为元素赋值。

2、使用for循环对数组进行遍历，循环索引从0开始，到数组的长度-1结束。

3、逐个打印数组元素，打印元素不换行，在输出元素的后面拼接空格。

### 答案

```java
package day05;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for(int i = 0;i < arr.length;++i) {
            System.out.print(arr[i] + " ");
        }
    }
}

```

## 题目2（训练）

现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。

### 训练提示

1、数组的元素是小数，需要定义小数类型数组。

2、找最值需要先定义一个参考值，然后依次拿每个值与参考值比较即可。

### 解题方案

将数组的第一个值作为参考值，遍历数组，依次比较，记录更小值。

### 操作步骤

1、定义double类型数组并存入元素。

2、定义double类型变量min代表最小值，初始化为数组第一个值。

3、遍历数组，用每个元素依次和变量min对比。

4、如果发现有元素小于min，则把该元素赋值给min。

5、遍历结束之后min记录的就是最小值，打印结果。

### 答案

```java
package day05;

public class Test2 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double mi = arr[0];
        for(int i = 1;i < arr.length;++i) {
            if(arr[i] < mi) mi = arr[i];
        }
        System.out.println("最小值为： " + mi);
    }
}

```

## 题目3 (训练）

创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。

### 训练提示

1、数组有6个元素，那么就要生成6次随机数。

2、要求所有元素的和，首先需要定义变量来存储求和结果，然后再获取所有元素，依次累加就可以了。

### 解题方案

定义求和变量，遍历数组，累加元素值。

### 操作步骤

1、定义长度为6的int数组。

2、创建随机数Random类对象。

3、遍历数组，在循环中生成随机数并给数组元素赋值。

4、定义求和变量，初始化值为0。

5、遍历数组，获取每一个元素，累加。

6、遍历结束，打印结果。

### 答案

```java
package day05;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random ra = new Random();
        int[] arr = new int[6];

        int sum = 0;
        for(int i = 0;i < arr.length;++i) {
            arr[i] = ra.nextInt(100);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\n数组和的值为： " + sum);

    }
}

```

## 题目4(训练)

现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。例如：

```java
数组：{2, 1, 3, 5, 4}
表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
```

### 训练提示

1、首先肯定要获取数组的每一个元素，需要遍历。

2、根据题目分析，个位元素本身就可以表示值，十位是元素乘以10来表示值，百位就是元素乘以100来表示值。。。它们之间有什么规律呢？从左至右，每一位所表示的值是下一位的十倍。根据此规律，怎样编写算法实现呢？

### 解题方案

遍历数组，与求和的思路相似，但算法不同，累加时需要将高位*10再累加。

### 操作步骤

1、定义int类型数组，使用静态初始化，将数字存入数组。

2、定义变量num用来存储最终的数值。

3、对数组进行遍历，遍历开始索引是0，结束索引是arr.length-1。

4、在循环中，把num的值乘10再加上元素的值，赋值给num变量。

5、循环上面的步骤，num的值即为所求，打印结果。

### 答案

```java
package day05;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};

        int sum = 0;
        for(int i = 0;i < arr.length;++i) {
            sum = sum * 10 + arr[i];
        }
        System.out.println("数组表示的整数为： " + sum);
    }
}

```

## 题目5（训练）

定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。

### 训练提示

1、要操作数组的每一个元素，需要遍历。

2、怎样求平均数？其实只要求和之后也就知道了平均数。

### 解题方案

使用数组的遍历操作完成。

### 操作步骤

1. 定义保存学生成绩的数组arr。
2. 定义变量sum用来存储和。
3. 对数组进行遍历，求和。
4. 和除以元素个数得到平均数。
5. 打印结果。

### 答案

```
package day05;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int n = arr.length, sum = 0;

        for(int i = 0;i < arr.length;++i) sum += arr[i];
        System.out.println("学生平均成绩为: " + sum * 1.0 / n);
    }
}

```





## 题目6（训练）

有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：

```
请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90
```

### 训练提示

1. 数组的长度是不能改变的，所以增加一个元素需要定义一个新数组。
2. 数组元素是从小到大排列的，如何找到新元素存放的位置？

### 解题方案

​	使用数组的遍历，用元素依次和数字作比较，找到正确的存放位置。

### 操作步骤

1. 定义原数组arr，和一个比原数组长度大1的新数组brr。
2. 通过键盘录入的方式输入变量num的值。
3. 定义变量index用于记录num存放的索引位置。
4. 遍历数组，小于或等于num的元素直接存放到原来的位置，大于num的元素往后移动一个位置。
5. 存放结束之后，中间会空出一个位置,在遍历时用index记录这个位置。把num放在这个索引处。
6. 最终遍历新数组打印结果。

### 答案

```java
package day05;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] arr =  {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length + 1];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        boolean flag = false;
        for(int i = 0, j = 0;i < arr.length;++i) {
            if(!flag && n < arr[i]) {
                brr[j++] = n;
                brr[j++] = arr[i];
                flag = true;
            }
            else {
                brr[j++] = arr[i];
            }
        }

        for(int i = 0;i < brr.length;++i) System.out.print(brr[i] + " ");
    }
}

```

## 题目7（综合）

小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：

```
赚钱的股票一共有：4只
赔钱的股票一共有：6只
```

### 训练提示

1. 有多只股票，可以使用数组来存储。
2. 股票收益为小数，所以数组类型应该是小数。
3. 需要定义两个变量来分别存储统计的个数。

### 解题方案

1. 使用数组的遍历，判断每个股票的收益是正值还是负值，分别统计。

### 操作步骤

1. 定义小数数组存储十只股票的收益值。
2. 定义变量count1用于存储赚钱股票的个数，初始值是0。
3. 定义变量count2用于存储赔钱股票的个数，初始值是0。
4. 遍历数组判断，如果收益大于0则count1加一，如果收益小于0则count2加一。
5. 遍历结束后打印两个变量值。

### 答案

```java
package day05;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int add = 0, sub = 0, mid = 0;
        for(int i = 0;i < arr.size();++i) {
            if(arr[i] < 0) sub ++;
            else if(arr[i] > 0) add ++;
            else mid ++;
        }

        System.out.println("赚钱的股票为： " + add， "亏钱的股票为： " + sub);
    }
}

```





## 题目8（综合）

定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）

### 训练提示

1. 要找奇数和偶数只需要判断对2取余即可。
2. 找到一个奇数或偶数之后，把它放在哪个索引处？

### 解题方案

1. 定义一个新数组。把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边。

2. 不定义新数组。找到左边的偶数，和右边的奇数互换位置。

   以下以方案1为准

### 操作步骤

1. 定义出原数组arr，其中包含多个数字。
2. 定义新数组brr，和arr的长度一样。
3. 定义变量left，初始值是0准备从左边放元素，定义变量right，初始值是arr.length-1准备从右边放元素。
4. 对原数组arr进行遍历。
5. 如果元素是奇数，则放在新数组brr的左边，left变量加一。
6. 如果元素是偶数，则放在新数组brr的右边，right变量减一。
7. 遍历新数组brr打印最终结果。

### 答案

```java
package day05;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] brr = new int[9];

        int l = 0, r = arr.length - 1;
        for(int i = 0;i < arr.length;++i) {
            if(arr[i] % 2 == 1) brr[l++] = arr[i];
            else brr[r--] = arr[i];
        }

        for(int i = 0;i < brr.length;++i) System.out.print(brr[i] + " ");

    }
}

```



# 方法



## 题目1（训练）

定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。

### 训练提示

1. 根据方法的功能描述，方法的参数应该是两个小数。
2. 要返回两个小数的较小值，所以返回值类型也是小数类型。

### 解题方案

### 操作步骤

1. 定义方法getMin()，方法的参数是double a ，double b。
2. 在方法中对两个数字进行判断，返回较小值。
3. 在主方法中调用getMin()方法并接受返回值。
4. 在主方法中打印结果。

### 代码

```java
package day05.homework;

import java.util.Random;

public class Text1 {
    public static void main(String[] args) {
        double a = 4.67;
        double b = 10.22;
        System.out.println("min:" + GetMin(a, b));
    }
    public static double GetMin(double a,double b){
        return a > b ? b : a;
    }
}
```

## 题目2（训练）

定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。

### 训练提示

1. 根据题意，方法中需要使用三个整数，所以方法参数应该是三个整数类型。
2. 方法需要有返回值，返回值的类型也是整数类型。

### 解题方案

### 操作步骤

1. 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
2. 在方法中使用多分支if...else...判断出最大值并返回。
3. 在主方法中调用getMax()方法并接受返回值。
4. 在主方法中打印结果。

### 代码

```java
package day05.homework;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int num =GetMax(a, b, c);
        System.out.println("max:" + GetMax(a, b, c));
    }
    public static int GetMax(int a,int b, int c){
        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else return c;
    }
}

```

## 题目3（训练）

通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：

```
请输入行数：
4
请输入列数：
5
@@@@@
@@@@@
@@@@@
@@@@@
```

### 训练提示

1. 方法内需要知道行数和列数，所以参数应该是两个整数类型。
2. 方法不需要返回任何值，所以返回值类型应该是void。

### 解题方案

### 操作步骤

1. 创建键盘录入对象。
2. 通过键盘录入n的值代表行数，通过键盘录入m的值代表列数。
3. 定义print()方法，方法的参数是两个整数n和m,返回值类型是void。
4. 在方法中使用循环嵌套按照指定格式输出内容。
5. 在主方法中调用print方法，传入n和m两个参数。

### 答案

```java
package day05.homework;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print(num);
    }
    public static void Print(int num){
        for(int i = 0;i < num;i++){
            for(int j = 0;j < num;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

}

```

## 题目4（训练）

我们知道数学中有九九乘法表。请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n，测试方法。执行效果如下：

```
请输入一个1-9之间的整数：
4
乘法表：
1×1=1	
1×2=2	2×2=4	
1×3=3	2×3=6	3×3=9	
1×4=4	2×4=8	3×4=12	4×4=16

```

### 训练提示

1. 方法需要一个整数变量n,那么方法的参数如何定义？
2. 方法的目的是做打印，那么方法的返回值类型是什么？

### 解题方案

### 操作步骤

1. 创建键盘录入对象。

2. 通过键盘输入一个整数变量n。

3. 定义乘法表的方法，方法参数是int类型参数n，返回值类型void。

   3.1. 方法内部定义嵌套循环，外层循环从1开始，到n结束，代表打印n行。

   3.2.内层循环从1开始，到i结束，代表每行打印i个式子。

   3.3.每行最后打印换行。

4. 在主方法中对方法进行调用。

### 答案

```java
package day05.homework;

import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        System.out.println("输出一个1-9的数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
    }
    public static void Print(int n){
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++){
                System.out.print(i + "*" + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}

```

## 题目5（训练）

在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：

```
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10 
```

### 训练提示

1. 方法需要接受三个整数，那么方法的形式参数如何定义？
2. 方法没有返回值的需求，返回值类型是什么？

### 解题方案

### 操作步骤

1. 使用键盘录入分别录入三个整数。

2. 定义method方法，方法的参数是三个int类型，方法的返回值类型是void。

   2.1. 定义整数变量max用于存储最大值，定义min变量用于存储最小值。

   2.2. 使用if..else..多分支判断语句计算三个整数中的最大值并赋值给max。

   2.3. 使用if..else..多分支判断语句计算三个整数中的最小值并赋值给min。

   2.4. 定义变量mid代表中间数,三个整数的和减去max,再减去min,就是中间数的值。

   2.5. 依次打印最大值，中间值和最小值。

3. 在主方法中调用method方法，传入参数。

### 答案

```java
package day05.homework;

import java.util.Scanner;

public class Text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sort(a, b, c);

    }
    public static void sort(int a,int b, int c){
        int temp = 0;
        if( a > b ){	
            temp = a ;
            a = b ;
            b = temp ;
        }
        if( a > c ){	
            temp = a ;
            a = c ;
            c = temp ;
        }
        if( b > c ){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("sort:" + a + " " + b+ " " + c);
    }

}
```

## 题目6（训练）

数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。

### 训练提示

1. 方法的功能是得到一个小数的绝对值，参数应该是一个小数类型。
2. 绝对值需要被返回，返回值类型应该也是小数类型。

### 解题方案

### 操作步骤

1. 定义一个小数变量num。

2. 定义获取绝对值的方法，方法的参数是一个double类型，返回值类型是double。

3. 在方法内部使用if..else..判断。

   3.1. 如果是负数则对负数取反并返回。

   3.2. 如果不是负数则直接返回数字本身。

4. 在主方法中调用绝对值方法，传入参数num,并接受返回值。
5. 打印返回的结果。

### 答案

```java
package day05.homework;

import java.util.Scanner;

public class Text6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double ans = GetAbsult(num);
        System.out.println("绝对值为" + ans);
    }
    public static double GetAbsult(double num){
        if(num >= 0)
        return num;
        else return 0 - num;
    }
}
```

## 题目7（综合）

请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。

### 训练提示

1. 要求对小数进行操作，方法的参数类型是一个小数类型。
2. 操作之后的结果是int整数，那么返回值类型是int类型。
3. 四舍五入的操作关键是十分位(小数第一位)，如何获取十分位？

### 解题方案

### 操作步骤

1. 定义一个正数的小数数字num。
2. 定义四舍五入的方法，方法的参数是一个double类型num，返回值类型是int类型。
3. 将小数乘以10后强转为int,再对10取余，能过获取到十分位数字，赋值给int类型变量a。
4. 对a进行判断，如果a小于4则把num强转为int并返回(舍去小数)。
5. 如果a大于等于5则把num强转为int后再加一并返回(相当于进一位)。
6. 在主方法中调用四舍五入方法，传入参数num，并接收返回值。
7. 打印返回的结果。

### 答案

```java
package day05.homework;

import java.util.Scanner;

public class Text7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double num2 =(num - (int)num) * 10;
        int ans = (int) num + GetNumber(num2);
        System.out.println(ans);
    }
    public static int GetNumber(double num2){
        if(num2 >= 5) return 1;
        else return 0;
    }
}

```

## 题目8（综合扩展）

一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）

```
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
```

### 训练提示

1. 奖项要随机出现，但奖金不是连续的数字，不能被随机产生。能随机产生的只有数组的索引了，可以使用随机索引来代表随机元素。因为索引和元素是一一对应的，
2. 哪些奖被抽过了，哪些奖没有被抽过，要定义一个数组来存放已经被抽过的奖项。
3. 每个奖项只能被抽出一次，要写一个方法来控制奖项不重复。

### 解题方案

	使用数组存放多个奖金，再使用另一个数组存放已经被抽过的奖金，使用方法来判断某个奖金是否已经被抽取过。

### 操作步骤

1. 定义奖金的数组arr。
2. 定义数组brr准备存放已经被抽过的奖金，两个数组长度相同。
3. 定义一个变量index,用户代表数组brr的索引。
4. 定义方法，判断数组中是否存在某数字，存在返回true,不存在返回false。
5. 写一个while循环，如果index<arr.length则说明奖项没有被抽完继续抽取。
6. 在循环中使用随机数产生一个随机索引i。
7. 使用步骤4的方法判断brr数组中是否包含arr[i]奖金。
8. 如果不包含，则打印arr[i]奖金，并且把它放入brr数组中代表已经被抽取过，同时index加一。

### 答案

```java
package day05.homework;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Random;

public class text8 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = {0, 0, 0, 0, 0};
        IsFull(arr, brr);
    }
    public static void IsFull(int[] arr,int[] brr){
        Random r = new Random();
        int index;
        int longer = arr.length;
        while(longer > 0){
            index = r.nextInt(5);
            if(arr[index] != 0){
                brr[index] = arr[index];
                arr[index] = 0;
                longer--;
                System.out.println("抽出 " + brr[index] + "元奖金");
            }
        }
    }
}
```
