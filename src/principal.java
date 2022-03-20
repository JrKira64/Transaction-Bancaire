
import java.util.Scanner;
import java.util.Vector;

public class principal {

	public static void main(String[] args) {
		
		Client client = new Client(null,null,0,null);
		Compte compte = new Compte(0,0,null,null,0);
		
		// @Author Kira
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("");
		
		System.out.println("BONJOUR, BIENVENUE SUR ECOKIRA, AVEZ VOUS UN COMPTE ?");
		System.out.println("1. OUI");
		System.out.println("2. NON");

		int choice = 0;
		int lon=0;
		int codeSecret=0;
		int confirmPass = 0;
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			Scanner e1 = new Scanner(System.in);
			System.out.print("ENTRER LE NUMERO DE VOTRE COMPTE : ");
			int numeroCompte = e1.nextInt();
			
			System.out.println("---------------------------------");
			
			Scanner e2 = new Scanner(System.in);
			System.out.print("ENTRER LE CODE DE VOTRE COMPTE (A 4 CHIFFRES) : ");
			int codeCompte = e2.nextInt();
			
			System.out.println("---------------------------------");
			
			System.out.println("RECHERCHE DU COMPTE EN COURS ....");
		break;
		
		case 2:
			System.out.println("OK, NOUS ALLONS PROCEDER A LA CREATION DE VOTRE COMPTE ...\n");
			Scanner e3 = new Scanner(System.in);
			System.out.print("ENTRER VOTRE NOM : ");
			String nom = e3.nextLine();
			
			Scanner e5 = new Scanner(System.in);
			System.out.print("ENTRER VOTRE PRENOM : ");
			String prenom = e5.nextLine();
			
			Scanner e6 = new Scanner(System.in);
			System.out.print("QUEL AGE AVEZ VOUS ? : ");
			int age = e6.nextInt();
			
			Scanner e7 = new Scanner(System.in);
			System.out.print("ENTRER VOTRE SEXE : ");
			String sexe = e7.nextLine();
			
			System.out.println("\n");
			
			System.out.println("---------------------------------");
			
			
			
			do {

				System.out.print("DEFINIR UN CODE A QUATRE CHIFFRES : ");
				Scanner e4 = new Scanner(System.in);
				codeSecret = e4.nextInt();
				
				
				lon = (int) Math.floor(Math.log10(codeSecret)+1);
				
				if(lon < 4 || lon>4) {
					System.out.println("NOMBRE DE CARACTERE NON RESPECTER");
				}
				
			}while(lon < 4 || lon>4);
				
			if(lon==4){
				
				client.setnom(nom);
				client.setprenom(prenom);
				client.setage(age);
				client.setSexe(sexe);
				
				compte.setcode(codeSecret);
				compte.setsolde(2500);
				
				System.out.println("\nCOMPTE CREER AVEC SUCCEE, VOUS AVEZ UN SOLDE DE BASE DE 2500FCFA \n");
			}
						
			
		}
		
		menu mn = new menu();
			 mn.menuDisplay();

		/*
		 
		  -------------------------------------------
		 .		 		  							.
		 .											.
		 .            @Author : KIRA   				.
		 .											.
		 --------------------------------------------
		  
		  */
			 
		/*
		 * 
		 * AMELIORER LE SWITCH SUIVANT EN FAISANT INTERVENIR LE MOT DE PASSE AVANT TOUTE TRANSACTION
		 * 
		 * */
		
		
			
			 System.out.println("\n QUE VOULEZ VOUS FAIRE ? \n");
			 
	
		
		Scanner m = new Scanner(System.in);
		int choice_mn = m.nextInt();
		
		switch(choice_mn) {
			case 1 :
				System.out.println("\nOK, veillez renseigner la somme d'argent à créditer :");
				Scanner sc8 = new Scanner(System.in);
						double somme = sc8.nextDouble();
						
						if(somme>compte.getsolde()) {
							double nsomme;
							do {
								System.out.println("Solde Insuffisant, vous n'avez que "+ compte.getsolde()+", mettez une somme inferieur ou égale");
								nsomme = sc8.nextDouble();
							}while(nsomme >= compte.getsolde());
							
						}
						
						if(somme<=compte.getsolde()) {
							
							System.out.println("Confirmer votre transaction avec votre mot de passe");
							Scanner sc9 = new Scanner(System.in);
									confirmPass = sc9.nextInt();
									
									if(confirmPass != codeSecret) {
										int j;
										for(j=0;j<2;j+=1) {
											int dec=3-j;
											do {
												System.out.println("Mot de passe incorrect, veillez reprendre,il vous reste "+ dec +" tentative(s)");
												confirmPass = sc9.nextInt();
											}while(confirmPass == codeSecret);
										}
										
										if(confirmPass != codeSecret) {
											System.out.println("Echec de la transaction");
										}
											
									}
									
									if(confirmPass == codeSecret){
										compte.crediter(somme);
										System.out.println("Envoie reussi, votre nouveau solde est : "+(compte.getsolde()-somme));

									}
						}
											
						
						break;
			
			case 2 :
				System.out.println("\nOK, veillez renseigner la somme d'argent à débiter :");
				Scanner sc10 = new Scanner(System.in);
						double sommed = sc10.nextDouble();
						compte.debiter(sommed);
						System.out.println("Rechargement reussi, votre nouveau solde est : "+compte.getsolde());
			break;
		}
			 
	}

}
