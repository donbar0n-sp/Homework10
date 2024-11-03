public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        //task2
        System.out.println("task2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        //task3
        System.out.println("task3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);

    }
}