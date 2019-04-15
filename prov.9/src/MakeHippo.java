public class MakeHippo {
    public static void main(String [] args){ //точка запуска
        Hippo h = new Hippo("Бегемотик - Мотик ");//создаем бегемотика , передаем его конструктору имени бегемотик
        System.out.println(h.getName());//вызываем метод getName() унаследованный классом бегемотик
    }
}
