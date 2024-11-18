package Lession_4;

public class Park {
    public class Attraction {
        public String name;
        public int minAge;
        public int price;
        public int seats;

        public Attraction(String name, int minAge, int price, int seats) {
            this.name = name;
            this.minAge = minAge;
            this.price = price;
            this.seats = seats;
        }

        public void attractionDisplay() {
            System.out.println("Название: " + name + ", Минимальный возраст " + minAge + ", Цена за билет: " + price + ", Посадочные места" + seats);
        }
    }
}
