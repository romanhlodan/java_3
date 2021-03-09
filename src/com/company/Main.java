package com.company;

public class Main {

    public static void main(String[] args) {
//----1 Стоврити класс Персона, та Тваринка
//   В Персона є тваринка. У персона є ім'я, прізвище, вік, Пошта.
//   В тваринки є клічка, вік. Пошта - сайт , логін, пароль
//Поведінка. Тварини -  Гавкати. Пісяти(усюди) Пошти - логінитись (логін, пароль) => Ви залогінені
        Person person = new Person("Hlodan", "Lesia", 48, "Ralf", 4);
        System.out.println(person);
        person.pets.gav();
        person.pets.suk();
        person.post();
        System.out.println("_______________");
        Person person1 = new Person("Hlodan", "Volodimir", 53, "Ryduk", 5);
        System.out.println(person1);
        person1.post();
        person1.pets.suk();
        person1.pets.gav();

//-----2 Компанія.назва Департаменти [], Працівників [ім'я, прізвище, стаж, посаду]
        Company company = new Company();
        company.setName("IT-HRV");
        company.setDepart(new String[]{"Developers", "Test","SEO"});
        company.setStuff(new String[]{"Roman", "Olga", "Petro"});
        System.out.println(company);

//----3 Зявка: номер, дата. Клієната: прізвище, ім'я, дату народження. Паспорт: серію, номер, ким виданий.
        Application application = new Application(11,"03.03.2021",new Client("Hlodan","Roman","26.09.1996",new Passport("KC",927859,"Дрогобицьким МВ ГУ ДМС України")));
//        System.out.println(application);
        Passport passport = new Passport("KC", 964578, "Дрогобицьким");
        Client olga = new Client("Hlodan", "Olga", "16.06.1997",passport);
        Application application1 = new Application(1, "03.03.2021", olga);
//        System.out.println(application1);
        System.out.println(application1.getClient().passport);


    }
}
