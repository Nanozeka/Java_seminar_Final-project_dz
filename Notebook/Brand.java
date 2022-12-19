// Создание класса Brand(Для добавления в класс laptop)

public class Brand {

    // Создание полей
    private String brand;
    private String country;
    private String language;

    // Создание конструктора для экземпляра класса
    public Brand(String brand, String country, String language){
        this.brand = brand;
        this.country = country;
        this.language = language;
        }
    // Создание методов get\set Для работы с private полями
    public String getBrand() {return brand;}
    public String getCountry() {return country;}
    public String getLanguage() {return language;}

    // метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "Brand [brand= " + brand + ", country= " + country + ", language= " + language + "]";
    }
}
    