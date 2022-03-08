package com.company;

import java.util.ArrayList;

public class Seller extends User{
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

    public void BrowseActiveBuyers()
    {
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




}
