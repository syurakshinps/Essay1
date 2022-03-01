package com.company;

public class Buyer extends User{
    /*
    2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
     */

    public Buyer(String login) {
        super(login);
    }

    public void BrowseActiveBuyers()
    {

    }

}
