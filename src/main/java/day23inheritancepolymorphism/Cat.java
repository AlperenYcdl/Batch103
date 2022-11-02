package day23inheritancepolymorphism;

public class Cat extends Mammal{



    public void moew () {
        System.out.println("Cats meow");
    }

    @Override //Override annotation ini kullanarak, Java nin yaptigimiz override islemini kontrol etmesini sagliyoruz.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }








    /*
        1)Override yaparken method un bodysi degistirilir(sout kismi)
        2)Override yaparken ASLA method signature a (isim ve parametre ) degistirilemez
        3)Override yaparken "inheritance" olmak zorundadir.
        4)Override yaparken "access modifier" lar belli kurallara gore farklilastirilabilirler.
            i)"private" method lar override edilmezler
            ii)Child Class daki "override" edilen method un access modifier i Parent class daki
               method un access modifier i ile ayni veya genis olmalidir.
                 Note: Child Class'taki method'un access modifier'ı daha dar olamaz.
            iii)Default method'lar aynı package içindeyse override edilebilirler
                farklı package'dewn override edilemezler

        5)Parent Class'daki method'un "return type" ı "void" ise "return type" değiştirilemez.
        6)Parent Class'daki method'un "return type" ı "primitive" ise "return type" değiştirilemez.
        7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
        8)Parent Class'daki methodun "return type" i Parent Class ise "return type" ?
            Note:Child Class'daki"return type" Parent Class'dakinden genis olamaz
            Note: Aralarında "Parent-Child" ilişkisi olmayan Class'lar Overriding'de return type değişiminde
             kullanılamazlar.Mesela "Short", "Integer"dan küçüktür, fakat aralarında "Parent-Child" ilişkisi
             olmadığından "Integer" yerine "Short" kullanamazsınız.
           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir

        9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
        10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
             "final" method body degistirilmesine musaade etmez.
        11) Polymorphism  = Overloading + Overriding
             Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin
        12) Overloading ile Overriding arasindaki farklar nelerdir?
                i)Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
                ii)"private" method'lar Overload edilebilir, Override edilemezler.
                iii)"final" method'lar Overload edilebilir, Override edilemezler.
                iv)"Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
                   Cunku "static" method'lar Overload edilebilir, Override edilemezler.
                v) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.
     */

}

