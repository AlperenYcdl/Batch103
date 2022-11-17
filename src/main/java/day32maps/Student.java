package day32maps;

public class Student {

    public String name;//Stringlere eger atama yapmazsan null olur.
    public String email;
    public int age;
    public boolean success;


    public Student(String name, String email, int age, boolean success) {//constructor olusturduk sag tik ile.
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override //okunabilir bir sekilde gormek istiyorsan toString kullanilmalilidir.
    //istedigin formatta gormek icin. kaldirirsan detaylarini degil o objenin adresini verir.
    public String toString() {//yukardaki class tan olusan objelerin detaylarini console a yazdirir.
        return "{ " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                "}";//}silersen degistirilebilir.
    }
}
