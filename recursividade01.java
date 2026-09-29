public class recursividade01 {
    public static void main(String args[]){
        int result1 = soma(1);
        System.out.println("1)(1+2+3+...+100)=\n"+result1);
        
        int result2 = soma2(5);
        System.out.println("\n2)(5) + (5-1) + (5-2) + ... + (1) = \n"+result2);
        
        double result3 = soma3(5);
        System.out.printf("\n3)(1/1) + (1/2) + (1/3) + ....+ (1/5) = \n%.2f\n",result3);

        double result4 = soma4(5, 1);
        System.out.println("\n4)(51) +(51 / 2 ) + (52 / 3) + .... + (1/5) = \n"+result4);
        
        int result5 = soma5(5);
        System.out.println("\n5)(5)! + (5-1)! + (5-2)! + ... + (1)! = \n"+result5);
    }
    
    //1)   Serie1 = (1+2+3+...+100)
    public static int soma(int i){
        if(i <= 100)
            return i + soma(i + 1);
        
        return 0;
    }
    
    //2)   Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
    public static int soma2(int n){
        if(n >= 1)
            return n + soma2(n - 1);
        
        return 0;
    }
        
    //3)   Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
    public static double soma3(int n){
        if(n==1)
            return 1;
        
        return (1.0/n) + soma3(n-1);
    }
        
    //4)   Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
    public static double soma4(double n, double i){    
        if(n == 1)
            return 1.0/i;
        
        return (n/i) + soma4(n-1, i+1);
    }
    
    //5)   Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
    public static int fatorial(int n){
        if (n==1)
            return 1;
        
        return n * fatorial(n-1);
    }
    public static int soma5(int n){
        if (n == 1)
            return 0;
        
        return fatorial(n)+soma5(n-1);
    }
}
