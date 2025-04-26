package test;

class WantCat {
    static String cat;

    static {
        cat = "고양이";
        System.out.println("나만 없어 " + cat);
    }
}

public class Cat {
    public static void main(String[] args) {
        System.out.println("갖고 싶어 " + WantCat.cat);

        System.out.println("야옹 야옹 " + WantCat.cat);
    }
}
