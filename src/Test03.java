public class Test03 {
    public static void main(String[] args) {
        //二分法猜数
        int [] arrys={1,2,3,5,7,8,9,10,14,15,16,23,34,45,67,89,100};
        int sm=15;
        int head=0;
        int tail=arrys.length-1;
        while(head<=tail){
            int avg=(head+tail)/2;
            if(arrys[avg]==sm){
                System.out.println("恭喜你猜对了！数字为"+arrys[avg]+"位置为"+avg);
                break;
            }
            if (arrys[avg]<sm){
                head=avg+1;
            }
            if (arrys[avg]>sm){
                tail=avg-1;
            }
        }

    }
}
