package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        FileReader fstream = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fstream);
        ArrayList<String> list = new ArrayList<>();
        String strLine;

        while ((strLine = br.readLine()) != null){
            list.add(strLine);
        }
        fstream.close();
        br.close();
        String str = null;
        String date1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        for(int i=0;i<list.size();i++) {
            str = list.get(i).replaceAll("[0-9]", "").trim();
            date1 = list.get(i).replaceAll("[^0-9 ]", "");
            PEOPLE.add(new Person(str,sdf.parse(date1)));
        }



    }
}
