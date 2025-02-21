/*
Scanner sc = new Scanner(System.in);
        System.out.println("Donnez la taille du tableau : ");
        int t = sc.nextInt();

        //Declaration
        int[][] tab = new int[t][];

        for (int i =0 ; i<tab.length ; i++){
        System.out.print("Donnez le nombre de case de la ligne "+(i+1)+" : ");
        int n = sc.nextInt();
        tab[i] = new int[n];
        }

        //Remplissage
        for (int i = 0 ; i<tab.length ; i++){
        for (int j = 0; j<tab[i].length ; j++){
        System.out.println("Entrez la valeur de la case "+(i+1)+","+(j+1)+" : ");
        tab[i][j] = sc.nextInt() ;
        }
        }

        //Affichage
        System.out.println("boucle for classique : ");
        for (int i = 0 ; i<tab.length ; i++){
        for (int j = 0; j<tab[i].length ; j++){
        System.out.print(tab[i][j]+" ");
        }
        System.out.println();
        }

        System.out.println("boucle for amelioree : ");
        for ( int[] tb : tab){
        for (int e : tb){
        System.out.print(e + " ");
        }
        System.out.println();
        }

 */