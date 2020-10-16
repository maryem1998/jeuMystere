import java.util.*;

public class jeu
{
	public static void Niveau3(int n , char c ) {
	int i=1 ; 
	int nbr =0 ; 
	char ch = ' ' ;
	boolean testint = false ; 
	boolean testchar= false ; 
		
		do{
			if (testint == false)
			{Scanner sc = new Scanner(System.in);
			System.out.println("Donner le mystere entre 10 et 100");
			nbr = sc.nextInt();
				}
			if (testchar== false)
			{Scanner scc = new Scanner(System.in);
			System.out.println("Donner la lettre mystere ");
			ch = scc.next().charAt(0);
			 }
			int tent = 15-i ;
			if ((nbr>n) && ch> c){ 
			System.out.println("C'est moins pour le nombre       Le caractere est avant  ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
			}else {
				if ((nbr<n) && ch< c){
			System.out.println("C'est plus pour le nombre       Le caractere est apres ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
			}else{
				if((nbr>n) && ch< c){
			System.out.println("C'est moins pour le nombre     Le caractere est apres  ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
					
					} else {
					if((nbr<n) && ch> c) {
			System.out.println("C'est plus pour le nombre      Le caractere est avant  ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
			

					} 
					else {if((nbr == n) && ch> c) {
			testint = true ;
			System.out.println("Le nombre est correct "+ nbr+"       Le caractere est avant  ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
		}
						else{if((nbr==n) && ch < c){
			testint = true ;			
			System.out.println("Le nombre est correct "+ nbr+"       Le caractere est apres  ");	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
							}else{if((nbr < n) && ch == c){
			testchar = true ;
			System.out.println("C'est plus pour le nombre       Le caractere est correct "+ c);	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
			
				}

				else{if((nbr > n) && ch == c){
			testchar = true ;
			System.out.println("C'est moins pour le nombre       Le caractere est correct "+ c);	
			System.out.println("il vous reste "+ tent +" tentatives") ; 
				}else{
				testint = true ;
				testchar = true ;
		System.out.println("Bravo vous avez gagne au bout de "+ i +" Tentatives " ) ;


}}
					
						}}
				
				
						}

				}
		
						}
} 

		i++ ;
		}
		while(nbr!=n|| ch != c || testint== false || testchar== false) ;

	if (testint== false || testchar== false ) 
		{
			
			System.out.println(" Vous avez perdu :( " ) ;}


	}

	public static void Niveau1_2(int n , int choix ) {
		int i=1 ; 
		boolean test = false ; 
		int nbr ; 
		do
		{
		Scanner sc = new Scanner(System.in);
		if (choix == 1){System.out.println("Donner le mystere entre 0 et 100");}
		if (choix == 2){System.out.println("Donner le mystere entre 0 et 10000");}
		nbr = sc.nextInt();
		int tent = 15-i ;
		if (nbr>n)
		{
			System.out.println("C'est moins , il vous reste "+ tent +" Tentatives ");		
		}
		else
		{ if (nbr<n) {System.out.println("C'est plus , il vous reste "+ tent +" Tentatives "); 
				
			}else {
				
				test = true ;
				System.out.println("Bravo vous avez gagne au bout de "+ i +" Tentatives " ) ;
			 }
		
			}
		i++ ; 
		
		}
		while(nbr!=n || test== false ) ;

		if (test== false ) 
		{
			
			System.out.println(" Vous avez perdu :( " ) ;}

  }
  	public static void main(String args[])
  	{
		Scanner sc = new Scanner(System.in);
   		System.out.println("*************BIENVENUE AU JEU MYSTERE*************");
		System.out.println("----- Veuillez choisir le niveau : ------------");
		System.out.println("----- 1 : Niveau facile ---------------");
		System.out.println("----- 2 : Niveau moyen ----------------");
		System.out.println("----- 3 : Niveau difficile ------------");
		System.out.println("----- 0 : Quitter ---------------------");
		int choix = sc.nextInt();
		int n ;
		Random rand = new Random();
		switch(choix) {
  			case 0: System.exit(0) ;
   			 
    			break;
  			case 1: 
				n = rand.nextInt(101);
				System.out.println("Niveau facile : le mystere est entre 0 et 100");
				Niveau1_2(n,choix ) ; 
			break;
			case 2:
				n = rand.nextInt(10001);
				System.out.println("Niveau moyen : le mystere est entre 0 et 1000");
				Niveau1_2(n,choix ) ; 
			break;
			case 3:  n = rand.nextInt(101)+10;
				Random randc = new Random();
				char c = (char)(rand.nextInt(26) + 97);
				System.out.println("Niveau diffcile : le mystere est entre 10 et 100");
				Niveau3(n,c) ; 

			default:
    
			}
	}
}