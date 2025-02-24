
package tarefaarray;

public class Tarefaarray {

    public static void main(String[] args) {
        double[] alturas = new double[10];
        alturas[0] = 190;
        alturas[1] = 180;
        alturas[2] = 130;
        alturas[3] = 175;
        alturas[4] = 180;
        alturas[5] = 190;
        alturas[6] = 200;
        alturas[7] = 220;
        alturas[8] = 210;
        alturas[9]= 175;
        double soma= 0;

        for(int i = 0; i<10;i++){
            soma+= alturas[i];
        }           
        double media = soma /10;
        System.out.println("A média é: "+media);
        
    }
    
}
