package day04;

/**
 *  跳转控制语句：
 *      Continue：用于跳出当前循环的当次执行，进入下一次循环
 *  注意：Continue只能在循环中使用
 */

public class ContinueDemo {
    public static void main(String[] args) {
        /*
        假如你有老婆了，然后你犯错了，你老婆罚你做5天家务，每天都是洗碗
         但是洗碗到第三天的时候心软了，原谅你了不用洗了,但是依然不解恨，继续洗第四天和第五天
         */
        for (int i = 1;i <= 5;i++){
            if (i == 3){
                continue;//立即跳出当次执行，进入下一次循环
            }
            System.out.println("快乐的洗碗~~" + i);
        }
        /*
            假如你有老婆了，然后你犯错了，你老婆罚你说三天，每天说5句我错了，但是说到第二天的第三句心软了,当天不用说了，弟三天还是正常说
         */
        OUT:
        for (int i = 1;i <= 3;i++){
            for (int j = 1;j <= 5;j++){
                System.out.println("我错了~~" + "第" + i + "天" + "第" + j + "y");
                if (i == 2 && j == 3){
                    continue OUT;
                }
            }
        }
    }
}
