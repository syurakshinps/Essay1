package com.company;

import java.util.UUID;

public class Buyer extends User{
    /*
    2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
     */

    String FullName;
    String phoneNumber;
    String ID;

    public Buyer(String login, String fullName) {
        super(login);
        this.FullName = fullName;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UUID getID() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


}
