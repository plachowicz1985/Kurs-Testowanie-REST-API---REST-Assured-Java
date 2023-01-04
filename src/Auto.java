public class Auto {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    //konstruktor
    public Auto() {

    }

    public Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;

    }

    //metoda
    public void jedz() {
        System.out.println("Jedź!");
    }

    public void hamuj() {
        System.out.println("Hamuj!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg);
    }


    public static class ReadOnly {
        private String name = "Bartek";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
