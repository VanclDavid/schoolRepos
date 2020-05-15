package com.Competition;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Competition {
    private ArrayList<Runner> runners = new ArrayList<>();

    public Competition(String startFile,String endFile){
        this.loadStartList(startFile);
        this.loadFinalFile(startFile);
    }

    private void loadStartList(String startFile){
        String thisLine = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(startFile)));
            while ((thisLine = br.readLine()) != null) {
                runners.add(new Runner(thisLine));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void loadFinalFile(String endFile){
            File file = new File(endFile);

            try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
                while (sc.hasNextLine()){
                    System.out.println(sc.nextLine());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void listRunners(){
        for(Runner runner : this.runners){
            System.out.println(runner.toString());
        }
    }
}
