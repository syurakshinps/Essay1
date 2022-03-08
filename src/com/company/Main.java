package com.company;

import java.time.chrono.ThaiBuddhistEra;
import java.util.*;

public class Main {

    /*
    1. Создать абстрактный класс «Пользователь». У него должно быть публичное свойство «Логин»,
    приватное свойство «пароль».
 2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
 4. Есть исходный csv-файл со списком покупателей в формате: ФИО, Логин, пароль, телефон.
 4.1 Если строчка парсится (т.е. для каждого из полей выполняются условия,
 которые вы сами зададите своими регулярками), то такой покупатель создается в системе
 через конструктор класса "Покупатель". Таким образом,должна появиться
 коллекция покупателей с присвоенными ID.
 4.2 Если какая-то строка не парсится корректно, то выдается исключение.
 Исключение должно быть перехвачено, чтобы оно не приводило к аварийному завершению программы.
 5. Далее происходит вызов метода продавца  «Посмотреть активных покупателей»,
 в котором реализован вывод в итоговый csv-файл с сортировкой покупателей по ФИО.
 Сортировку реализовать с помощью интерфейса "Comparable".
     */

    public static void main(String[] args) throws Exception {
        ArrayList<String> InputFile = new ArrayList<>();
        String myInFile = "infile.csv";
        String lineRegex = "(\\D*);(\\D*);(\\D*);(\\d*)"; //Надо поправить формат!

        ReadFile myfile = new ReadFile(myInFile, lineRegex);
        myfile.ProcessFile();

        ArrayList<String> myOutList = new ArrayList<>();
        ArrayList<Buyer> Buyers = new ArrayList<Buyer>();

        for (String s : myfile.getArray()) {
            String[] fields = s.split(";");
            for (int j = 0; j < fields.length; j++) {
                myOutList.add(fields[j]);
            }

        }
        System.out.println(myOutList);
/*
        for (int i = 0; i < myfile.getArray().size(); i++) {
            String[] fields = myfile.getArray().get(i).split(";");
            for (int j = 0; j < fields.length; j++) {
                myOutList.add(fields[j]);
             //   System.out.println("fields length " + fields.length);
            }
            */
        for (String s : myfile.getArray()) {
           // System.out.println(s);
                String[] fields = s.split(";");
                for (int j = 0; j < fields.length; j++) {
                    myOutList.add(fields[j]);                }
                Buyers.add(new Buyer(fields[1],fields[0],fields[3],fields[2]));
        }


        for (Buyer s : Buyers) {
            System.out.println(s.getFullName() + " " + s.getPassWord()  + " "+ s.getPhoneNumber() + " " + s.getID() + " " + s.isActive());


        }
    }
}

        /*
        System.out.println(myOutList);
        Iterator<String> ite = myOutList.iterator();
        for (int i=0;  i < myfile.getArray().size(); i++)
        {
            System.out.println(i + "  " + myOutList.get(i));
            System.out.println(myfile.getArray().size());
            i +=i;

        }
        */
        /*
        while (ite.hasNext())
        {

            System.out.println(ite.next());
        }
        */
        /*
for (int i=1; i<myOutList.size();i=i+4) {
 //   System.out.println(myOutList.get(i));
}
        for (int i=1; i<myOutList.size();i=i+4) {
            if (new Buyer(myOutList.get(0), myOutList.get(i)).isActive()) {
                System.out.println(myOutList.get(i));

            }
        }
        */
//    System.out.println(myOutList.get(2));

        //}
  /*
        Buyer mybuyer1 = new Buyer(myOutList.get(1), myOutList.get(2));
        if (mybuyer1.isActive())
        {
            myOutList.add(4, "Active");
        }
*/
        //  System.out.println(myOutList);


        /*
        int sizeOfArray = myfile.getArray().size();
        com.company.Buyer[] buyers = new Buyer[sizeOfArray];
        for (int i=0; i<myfile.getArray().size(); i++)
        {
            String[] fields = myfile.getArray().get(i).split(";");
            buyers[i] = new Buyer(fields[0], fields[1]);
        }

        String loginSeller = "Seller";
        Seller s = new Seller("loginSeller", buyers, buyers.length);

        System.out.println("\r\n" + "List of active buyers \r\nas seen by seller login " + s.getSellerLogin() +"\r\n" +
                "--------------------\r\n");
        s.BrowseActiveBuyers();

        System.out.println("\r\nlist of all buyers \r\n---------------------");
        s.DumpAllBuyers();
    //    System.out.println(buyers[1].toString());
       //List buyersList= Arrays.asList(buyers[1].toString());
       List<Object> mylist = new ArrayList<>();
        Collections.addAll(mylist,buyers);
        for (Object s1 : mylist)
        {
            System.out.println(s1);
        }
        */



