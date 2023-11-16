import java.util.Scanner;

public class Calculatrice { 
    public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);


  System.out.println("Veuillez entrez votre premier numéro : ");
  double numéro1=scanner.nextDouble();
  System.out.println("Veuillez entrez votre deuxième numéro : ");
  double numéro2=scanner.nextDouble();
  double somme=numéro1+numéro2;
  double produit=numéro1*numéro2;
  double différence=numéro1-numéro2;
  double quotient=numéro1/numéro2;


  System.out.println("La somme des deux chiffres est : "+ somme);
  System.out.println("Le produit des deux chiffres est : "+ produit);
  System.out.println("La différence des deux chiffres est : "+ différence);
  System.out.println("Le quotient des deux chiffres est : "+ quotient);
}
}