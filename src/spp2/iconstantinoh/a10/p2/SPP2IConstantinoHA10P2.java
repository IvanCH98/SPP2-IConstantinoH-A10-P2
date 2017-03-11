/* Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a10.p2;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHA10P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] a,b,exodia;
        int tamano;
        tamano= solicitaTamano (); 
        a= creaMatriz("A",tamano);
        b= creaMatriz("B",tamano);
        exodia= multiplicacionMatrices (a,b);
    }
    
     
 public static int [][] creaMatriz(String string, int tamano){
int [][] arreglo= new int [tamano][tamano];
     System.out.println("Introduce los datos de la matriz "+string);
     for(int i=0;i<tamano;i++){
           for(int j=0;j<arreglo[i].length;j++){
            arreglo [i][j]= solicitaEntero();
             
           
           }
}
     return arreglo;
 }
 
 public static int solicitaTamano(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            try{
                System.out.println("Introduce el tamano de la matriz");                       
                n=kb.nextInt();
                flag=false;
            } catch (Exception ex){
                System.out.println("Vuelve a intentarlo");
                kb.next(); 
                flag=true;
                         
            }
        } while (flag);
return n;
     
 }
  public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
            } catch (Exception ex){
                System.out.println("Vuelve a intentarlo");
                flag=true;
                kb.next();          
            }
        } while (flag);
return n;
    }
      public static int[][] multiplicacionMatrices (int [][]a, int [][]b){
  
   int [][]r=new int [a.length][a.length];
    for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               for(int k=0; k<a.length;k++){
   r[i][j]= r[i][j] + (a[i][k]* b[k][j]);
          
  }
               System.out.print(r[i][j]+" ");
       
            }
   System.out.println("");
     
}
return r;
}
      }

