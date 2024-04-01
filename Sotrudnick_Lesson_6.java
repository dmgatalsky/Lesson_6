//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


public class Sotrudnick_Lesson_6 {
    String firstname, position, email;
    int number, salary, age;
    public Sotrudnick_Lesson_6(String firstname, String position, String email, int number, int salary, int age) {
        this.firstname = firstname;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
        System.out.println(" Firstname - " + firstname + " Position - " + position +
                " Email - " + email + " Telefon - " + number + " Zarplata - " + salary + " Age -" + age);
    }

    public static void main(String[] args) {
        System.out.println("первое задание");
        Sotrudnick_Lesson_6 st = new Sotrudnick_Lesson_6("Loid","engineer","Loid@email", 333333,2000,11); // часть первая 6.1
        System.out.println("Второе задание");
        Sotrudnick_Lesson_6[] persArray = new Sotrudnick_Lesson_6[5];
        persArray[0] = new Sotrudnick_Lesson_6("Ivanov", "engineer", "Ivanov@mail", 11111, 500, 10);       //часть вторая 6.2
        persArray[1] = new Sotrudnick_Lesson_6("Petrov", "engineer", "Petrov@mail", 22222, 600, 11);
        persArray[2] = new Sotrudnick_Lesson_6("Sidorov", "engineer", "Sidorov@mail", 33333, 700, 12);
        persArray[3] = new Sotrudnick_Lesson_6("Zaycev", "engineer", "Zaycev@mail", 4444, 800, 13);
        persArray[4] = new Sotrudnick_Lesson_6("Volkov", "engineer", "Volkov@mail", 5555, 900, 14);
        System.out.println("Третье задание");
        Park park = new Park();
        Park.Attraction attraction1 = new Park.Attraction("Горки","9:00-18:00",90);
        System.out.println("Название атракциона -"+attraction1.atractname+"- Время работы -"+attraction1.worktime+"- Стоимость -"+attraction1.prise+"-");
    }


    public static class Park {
        public static class Attraction{
            private  String atractname;
            private  String worktime;
            private  int prise;
            public Attraction (String atractname, String worktime, int prise){
                this.atractname=atractname;
                this.worktime=worktime;
                this.prise=prise;

            }
    }

}}






