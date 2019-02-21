import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sca = new  Scanner(System.in);
        System.out.println("请输入数字（石头为1，布为2，剪刀为3）");
        int i = sca.nextInt();
        Random r = new  Random();
        int j = r.nextInt(3)+1;
        String my="";
        String he="";
        if(i==1){
            my="石头";
        }
        if(i==2){
            my="布";
        }
        if(i==3){
            my="剪刀";
        }
        if(j==1){
            he="石头";
        }
        if(j==2){
            he="布";
        }if(j==3){
            he="剪刀";
        }
        int result=i-j;
        if(result<0){
            System.out.println("对不起你输了!");
            System.out.println("你是:"+my);
            System.out.println("它是:"+he);
        }else if(result==0){
            System.out.println("这局平局!");
            System.out.println("你是:"+my);
            System.out.println("它是:"+he);
        }
        else{
            System.out.println("恭喜你赢了!");
            System.out.println("你是:"+my);
            System.out.println("它是:"+he);
        }
    }
}
