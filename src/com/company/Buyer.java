package com.company;

import java.util.Random;
import java.util.UUID;
import java.util.random.RandomGenerator;

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

    public boolean isActive() {

        int  rand = (int) (Math.random() * 10);
    if (rand % 2 == 0)
        {            return true;         }
        else
        {            return false;        }

    }

    @Override
    public String toString() {
        return getFullName();
    }
}
