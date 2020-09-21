//package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        int n;
//        InputStream inputStream       = new FileInputStream("C:\\Users\\Damianek\\Desktop\\pla\\in\\pla7a.in");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linia = br.readLine();
        StringTokenizer st = new StringTokenizer(linia);
        n = Integer.parseInt(st.nextToken());
        int[] budynek =  new int [n];
for (int i = 0; i<n;i++){
    linia = br.readLine();
    st = new StringTokenizer(linia);
    st.nextToken();
    budynek[i] = Integer.parseInt(st.nextToken());
}



//int odpowiedz;
//        InputStream outputStream       = new FileInputStream("C:\\Users\\Damianek\\Desktop\\pla\\out\\pla7a.out");
//        BufferedReader bra = new BufferedReader(new InputStreamReader(System.in));
//        String liniaa = bra.readLine();
//        StringTokenizer sta = new StringTokenizer(liniaa);
//        odpowiedz = Integer.parseInt(sta.nextToken());

        long millisActualTime = System.currentTimeMillis();
        int wys = 0;
        int plakaty = 0;
ArrayList<Integer> blok = new ArrayList<>();
        for(int a = 0; a<n; a++){

            if(!blok.contains(a)){
            wys=budynek[a];

            if(a+1<n && wys>budynek[a+1] && !blok.contains(a) ){}else {plakaty = plakaty +1; blok.add(a);}
//                System.out.println("Szczyt : " + wys + "pozycja: " + a);}
            if((a+1<n && wys<=budynek[a+1])){
                int temp = a;
                do{
                    temp = temp + 1;
                    if (temp >= budynek.length) {
                        break;
                    }
                    if(budynek[temp] == wys){
                        blok.add(temp);
//                        System.out.println("dodaj: " + wys);
                    }

                }while (budynek[temp] >= wys);
            }
            if(a-1>=0 && budynek[a-1]<wys && !blok.contains(a)){plakaty = plakaty +1; blok.add(a);
//                System.out.println("Szczyt : " + wys + "pozycja 2: " + a);
                int temp = a;
                do{
                    temp = temp + 1;
                    if (temp >= budynek.length) {
                        break;
                    }
                    if(budynek[temp] == wys){
                        blok.add(temp);
                    }

                }while (budynek[temp] >= wys);

            }
                if(a-1>=0 && budynek[a-1]>wys && !blok.contains(a-1)){plakaty = plakaty +1; blok.add(a-1);
//                    System.out.println("Szczyt : " + wys + "pozycja wstecz: " + a);
                    int temp = a;
                    do{
                        temp = temp + 1;
                        if (temp >= budynek.length) {
                            break;
                        }
                        if(budynek[temp] == wys){
                            blok.add(temp);
                        }

                    }while (budynek[temp] >= wys);

                }
                if(a-1>=0 && budynek[a-1]>wys && !blok.contains(a)){plakaty = plakaty +1; blok.add(a);
//                    System.out.println("Szczyt : " + wys + "pozycja wstecz: " + a);
                    int temp = a;
                    do{
                        temp = temp + 1;
                        if (temp >= budynek.length) {
                            break;
                        }
                        if(budynek[temp] == wys){
                            blok.add(temp);
                        }

                    }while (budynek[temp] >= wys);

                }

    }else{}
        }
//        System.out.println(blok);
        System.out.println(plakaty);
        long executionTime = System.currentTimeMillis() - millisActualTime;
//        System.out.println("Czas wykonania : " + executionTime + "ms");
//        System.out.println("Odpowiedz: " + odpowiedz);
}}
