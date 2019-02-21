import java.util.Random;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);    //随机生成一个100以内的数
        Scanner sca = new Scanner(System.in);
        System.out.println("天上掉下来了一个数（0~99），看你猜不猜得到");
        int i = 1;                   //记录猜的次数
        while(true){
            int n = sca.nextInt();         //输入猜的数
            if(n == num){
                System.out.println("你猜对了！");
                if(i==1){
                    System.out.println("一次就猜到啦！");
                }else if(i>1&&i<=6){
                    System.out.println("这都被你猜到啦！");
                }else{
                    System.out.println("猜这么多次才猜到！");
                }
                System.out.println("你一共猜了"+i+"次");
                break;
            }
            if(n>num){         //判断数的大小
                System.out.println("猜得太大了！");
            }if(n<num){
                System.out.println("猜得太小了！");
            }
            i++;
        }
    }
}
