public class TestStaticMethod {
    public static void main(String[] args) {
        float x1=10.5f;
        float x2=5.5f;
        float ret1 = MyMath.plus(x1,x2);
        float ret2 = MyMath.minus(x1,x2);
        float ret3 = MyMath.multiply(x1,x2);
        float ret4 = MyMath.divide(x1,x2);
        double ret5=Math.pow(x1,x2);
        System.out.println("result"+x1+"+"+x2+"="+ret1) ;
        System.out.println("result"+x1+"-"+x2+"="+ret2) ;
        System.out.println("result"+x1+"x"+x2+"="+ret3) ;
        System.out.println("result"+x1+"/"+x2+"="+ret4) ; 
        System.out.println("result"+x1+"^"+x2+"="+ret5); 

    }

}
