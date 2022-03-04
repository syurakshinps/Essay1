package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    ArrayList<String> myRecord = new ArrayList<>();
    String fileName;

    public ReadFile(String fileName, String wholeLine) {
        this.fileName = fileName;
        this.wholeLine = wholeLine;
    }

    String wholeLine = "(\\D*);(\\d*);(\\d*)";
    String fileString = "([a-zA-Z]*);([a-zA-Z0-9]*);([a-zA-Z0-9!\\?\\.\\*]*);((\\+7|8)?(\\d{3})-?(\\d{7})";//ФИО, Логин, пароль, телефон
    Pattern fioPattern = Pattern.compile(wholeLine); // Это - factory method!



    public ArrayList<String> getArray() {
        return this.myRecord;
    }

    public void ProcessFile() throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fileinroot"));
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher fioMatcher = fioPattern.matcher(line);
                if (line.matches(wholeLine)) {
                    int i = 0;
                    while (fioMatcher.find() && (i < (fioMatcher.groupCount() + 1))) {
                        myRecord.add(fioMatcher.group(i));
                        i += i;
                    }
                }
            }
            //System.out.println(myRecord);
        } catch (FileNotFoundException e)
        {
            System.out.println("no such file");
        }

    }
}


