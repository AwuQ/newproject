public class Test01 {
    public static void main(String[] args) {
        //选择排序
        int [] arrys={1,34,56,67,78,90,3,2};
        for (int a=0;a<arrys.length-1;a++){
            int temp=a;
            for (int b=a+1;b<arrys.length;b++){
                if (arrys[temp]<arrys[b]){
                    temp=b;
                }
            }
            if (temp != a){
                int max=arrys[a];
                arrys[a]=arrys[temp];
                arrys[temp]=max;
            }
        }
        for(int c=0;c<arrys.length;c++){
            System.out.println(arrys[c]);
        }


    }
}
