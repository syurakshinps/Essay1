package com.company;

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
 через конструктор класса "Покупатель". Таким образом,должна появиться коллекция покупателей с присвоенными ID.
 4.2 Если какая-то строка не парсится корректно, то выдается исключение.
 Исключение должно быть перехвачено, чтобы оно не приводило к аварийному завершению программы.
 5. Далее происходит вызов метода продавца  «Посмотреть активных покупателей»,
 в котором реализован вывод в итоговый csv-файл с сортировкой покупателей по ФИО.
 Сортировку реализовать с помощью интерфейса "Comparable".
     */

    public static void main(String[] args) {
	// write your code here
    }
}
