package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Seller extends User implements Comparable{
    /*
    2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
     */
    ArrayList<Buyer> Buyers = new ArrayList<Buyer>();

    public Seller(String login, ArrayList<Buyer> Buyers) {
        super(login);
        this.Buyers = Buyers;
    }

    public void BrowseActiveBuyersSortedbyFamilyName()
    {
        Buyers.sort(Comparator.comparing(Buyer::getFullName));
        System.out.println("------------- active ones ---------");

        for (Buyer s : Buyers)
        {
            /*
            System.out.println(s.getFullName() + " " +
                                s.getPassWord()  + " " +
                                s.getPhoneNumber() + " " +
                                s.getID() + " " +
                                s.isActive());
            */


            if (s.isActive())
            {
                System.out.println(s.getFullName() + " " +
                        s.getPassWord()  + " " +
                        s.getPhoneNumber() + " " +
                        s.getID());
            }
        }



    }




    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
