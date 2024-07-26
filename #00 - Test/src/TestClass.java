import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        User a = new User();
        User b = new User();
        User c = new User();

        List<User> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(b);
        list1.add(c);

        List<User> list2 = new ArrayList<>();
        list2.add(b);
        list2.add(c);
        list2.add(a);

        // Comparator kullanarak hashCode'e göre sıralama yapalım
        list2.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                // hashCode() değerlerini karşılaştır
                return Integer.compare(u1.hashCode(), u2.hashCode());
            }
        });

        // Şimdi listelerin eşit olup olmadığını kontrol edebiliriz
        System.out.println(list1.equals(list2)); // true olarak çıkmalı
    }
}

class User {
    // User sınıfının diğer özellikleri ve metotları burada

    @Override
    public int hashCode() {
        // Özelleştirilmiş hashCode() metodu, örneğin burada bir özellik kullanarak hashCode üretebilirsiniz
        return Objects.hash(/* buraya kullanmak istediğiniz özellikler */);
    }
}
