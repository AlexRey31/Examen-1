
package parcial.pkg1.git;

import java.util.Scanner;

public class Parcial1Git {
    
    public static void main(String[] args) {
        int Op=0;
        int n=0;
        int NO1=0,NO2=0,NO3=0,NO4=0;
        double[] PD = new double[4];
        int[] CA = new int[4];
        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<PD.length;i++)
        {
            System.out.println();
            System.out.println();
            System.out.println("Ingrese las 4 notas ");
            CA[i]=i+1;
            System.out.println("Alumno "+CA[i]);
            System.out.println("Nota 1 "); NO1 = sc.nextInt();
            System.out.println("Nota 2 "); NO2 = sc.nextInt();
            System.out.println("Nota 3 "); NO3 = sc.nextInt();
            System.out.println("Nota 4 "); NO4 = sc.nextInt();
            PD[i]=(NO1+NO2+NO3+NO4)/4;
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        Orden(PD,CA);
    }
    static void Orden(double PD[],int CA[])
    {
        for(int i = 0; i < PD.length - 1; i++)
        {
            for(int j = 0; j < PD.length - 1; j++)
            {
                if (PD[j] < PD[j + 1])
                {
                    double Aux1 = PD[j+1];
                    PD[j+1] = PD[j];
                    PD[j] = Aux1;
                }
            }
        }
        for(int i = 0;i < PD.length; i++)
        {
            System.out.print(PD[i]+"\n");
            System.out.println();
        }
    }
}
