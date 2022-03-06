package com.company;

public class Seller extends User{
    /*
    2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
     */
    int sizeOfArray;
    Buyer[] buyers = new Buyer[sizeOfArray];

    public Seller(String login, Buyer[] buyers, int sizeOfArray) {
        super(login);
        this.buyers= buyers;
        this.sizeOfArray = sizeOfArray;
    }

    public void BrowseActiveBuyers()
    {
        for (int i= 0; i< buyers.length; i++) {
            if ((buyers[i].isActive()) == true)
            {
                System.out.println(i+1 + " " + buyers[i].getFullName());

            }
        }
    }

    public String getSellerLogin()
    {
       return this.Login;
    }

    public void DumpAllBuyers()
    {
        for (int i = 0; i< buyers.length;i++)
        System.out.println(i+1 + "   " + buyers[i].getFullName());
    }


}
