
public class Lista1_06_LeandroIkehara {

    public static void main(String[] args) {
    	
    	int a, b, c;
        double delta, x, x2;
 
        a = 1;
        b = 12;
        c = -13;
 
        delta = (b * b) + (-4 * (a * c));
        
        x = ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
        
        System.out.println("x = " + x);
        System.out.println("x2 = " + x2);
        System.out.println("O valor do Delta é: " + delta);
        
    }
    
}
