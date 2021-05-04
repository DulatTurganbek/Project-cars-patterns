package Project;

public class Details {
    private String Model;
    private String Color;
    private int Year;



    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public int getYear() {
        return Year;
    }

    private Details(CarBuilder builder) {
        this.Model = builder.Model;
        this.Color = builder.Color;
        this.Year = builder.Year;

    }

    //Builder Class
    public static class CarBuilder{

        // parameters
        private String Model;
        private String Color;
        private int Year;



        public CarBuilder(String model, String color, int year){
            this.Model = model;
            this.Color = color;
            this.Year = year;
        }




        public Details build(){
            return new Details(this);
        }
}

}

