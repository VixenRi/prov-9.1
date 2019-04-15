public abstract class  Animal {
    private String name; //Все потомки животных( включая дочерние классы) имеют имя
    public String getName(){ //геттер который унаследует в будущем  бегемотик
        return name; //возврат имени
    }
    public Animal (String theName){
        name=theName;//конструктор который принимает имя и присваевает его переменной экземпляра - имя
    }

}
