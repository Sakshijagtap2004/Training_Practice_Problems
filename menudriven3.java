import java.util.*;
class Java{
  public static void main(String args[]){
    System.out.println("Enter a amount");
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
     int noteCount;
    switch (amount) {
            case 2000:
                noteCount = amount / 2000;
                System.out.println("Number of 2000 notes: " + noteCount);
                if (noteCount>0){
                    amount = amount - noteCount*2000 ; 

                }
                n1 = amt/2000;
                amt = amt % 2000;
                

            case 500:
                noteCount = amount / 500;
                System.out.println("Number of 500 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*500 ; 
                }
               

            case 200:
                noteCount = amount / 200;
                System.out.println("Number of 200 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*200 ; 
                }
               

            case 100:
                noteCount = amount / 100;
                System.out.println("Number of 100 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*100 ; 
                }
              

            case 50:
                noteCount = amount / 50;
                System.out.println("Number of 50 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*50 ; 
                }
              

            case 20:
                noteCount = amount / 20;
                System.out.println("Number of 20 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*20 ; 
                }
                

            case 10:
                noteCount = amount / 10;
                System.out.println("Number of 10 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*10 ; 
                }

            case 5:
                noteCount = amount / 5;
                System.out.println("Number of 5 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*5 ; 
                }
              
            case 2:
                noteCount = amount / 2;
                System.out.println("Number of 2 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*2 ; 
                }
               
            case 1:
                noteCount = amount / 1;
                System.out.println("Number of 1 notes: " + noteCount);
                   if (noteCount>0){
                    amount = amount - noteCount*1 ; 
                }
                
            default:
                System.out.println("Invalid amount or unsupported denomination.");
        }
  }
}