package DAO;
import java.util.*;

public class EntradaDeDados
{
   public static String lerString(){
     Scanner s = new Scanner(System.in);
     String n;
             
          while(true){
                 try{
                      //ler metodo string
                      n=s.nextLine();
                      //System.out.println("OK");
                      break;
                    }
                 catch(Exception e){   
                       System.out.println("Erro: "+e.toString());
                       System.out.println("Digite novamente.");
                     }
                     
                    }
            
       return n;
                }
    
   public static int lerInteiro(){
     Scanner s = new Scanner(System.in);
     int n;
      
          while(true){
                 try{
                      n = s.nextInt();
                      //System.out.println("OK");
                      break;
                    }
                 catch(Exception e){   
                       System.out.println("Erro: "+e.toString());
                       System.out.println("Digite novamente.");
                     }
                     
                    }
            
       return n;
                }
    

  public static double  lerDouble(){
     Scanner s = new Scanner(System.in);
     double n;
      
          while(true){
                 try{
                      n = s.nextDouble();
                      //System.out.println("OK");
                      break;
                    }
                 catch(Exception e){   
                       System.out.println("Erro: "+e.toString());
                       System.out.println("Digite novamente.");
                     }
                     
                    }
            
       return n;
                }
    

  public static float  lerFloat(){
     Scanner s = new Scanner(System.in);
     float n;
      
          while(true){
                 try{
                      n = s.nextFloat();
                      //System.out.println("OK");
                      break;
                    }
                 catch(Exception e){   
                       System.out.println("Erro: "+e.toString());
                       System.out.println("Digite novamente.");
                     }
                     
                    }
            
       return n;
                }
                
                 


                

}

