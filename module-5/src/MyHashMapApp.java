public class MyHashMapApp {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Anna", 21);
        System.out.println("Добавление: " + map.get("Anna"));

        System.out.println("Отсутствующий ключ: " + map.get("Maria"));

        map.put("Anna", 25);
        System.out.println("Обновление: " + map.get("Anna"));

        map.remove("Anna");
        System.out.println("Удаление: " + map.get("Anna"));
    }
}
