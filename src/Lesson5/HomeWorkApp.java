package Lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {

       Person mainEmployee = new Person("Иван", "Иванович",
               "Иванов", "8(812)555-55-55",
               "Test Manager", 80000, 1989);
       Person[] office = {
               mainEmployee,
               new Person("Василий", "Васильевич", "Васильев", "8(812)555-55-55",
                       "Manager", 80000, 1991),
               new Person("Петр", "Иванович", "Петров", "8(812)555-11-22",
                       "Product Manager", 80000, 1967),
               new Person("Александр", "Иванович", "Сидоров", "8(812)555-22-33",
                       "Designer", 90000, 1989),
               new Person("Максим", "Иванович", "Максимов", "8(812)555-34-34",
                       "HR", 70000, 1990),
               new Person("Кирилл", "Иванович", "Кириллов", "8(812)555-55-55",
                       "Test Lead", 60000, 1956),
       };

       getAllPersonsInOffice(office);
       System.out.println("----------------");
       getOldPerson(office, 40);

    }
    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }

private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
}

}