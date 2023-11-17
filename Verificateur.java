import java.util.Scanner;
public class Verificateur { 
    public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  String reponse="oui";
 
    System.out.println("Rentrez un chiffre"); 
    
    int entree=scanner.nextInt();
    if(entree>0){
       System.out.println("Le chiffre que vous avez rentrer est positif : "+ entree);
    }else if(entree<0){ 
    
   
   
   System.out.println("Le chiffre que vous avez rentrer est négatif : "+ entree);
   }else{
       System.out.println("Le chiffre que vous avez rentrer est 0 : "+ entree);
   }
System.out.println("Voulez vous jouer encore? : ");
 reponse=scanner.nextLine();
if(reponse=="non"){
    System.out.println("Merci d'avoir joué : ");
//break;
 } else if(reponse=="oui")
 System.out.println("Veuillez entree un chiffre");
}
}
