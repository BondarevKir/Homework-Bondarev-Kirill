public class Park {
    public class Attraction {
        String name;
        int minAge;
        int price;
        int seats;

        Attraction(String name, int minAge, int price, int seats) {
            this.name = name;
            this.minAge = minAge;
            this.price = price;
            this.seats = seats;
        }

        public void attractionDisplay() {
            System.out.println("Название: " + name + ", Минимальный возраст " + minAge + ", Цена за билет: " + price + ", Посадочные места" + seats);
        }
    }

    public static void main(String[] args) {
        Attraction attraction1 = new Park().new Attraction("Американские горки", 18, 600, 20);
        Attraction attraction2 = new Park().new Attraction("Ладья", 7, 400, 54);
        Attraction attraction3 = new Park().new Attraction("Вечный двигатель", 16, 500, 24);
        Attraction attraction4 = new Park().new Attraction("Квантовый Скачок", 16, 500, 32);
        Attraction attraction5 = new Park().new Attraction("Катапульта", 10, 400, 20);
        attraction1.attractionDisplay();
        attraction2.attractionDisplay();
        attraction3.attractionDisplay();
        attraction4.attractionDisplay();
        attraction5.attractionDisplay();
    }
}
