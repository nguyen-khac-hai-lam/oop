public class RollLoadedDie {
    public static void main(String[] args) {
        double r= Math.random();

        if(r<5.0/8.0){
            int res=1+(int)(r*8);
            System.out.println(res);
        }
        else{
            int res=6;
            System.out.println(res);
        }
    }
}
