package hiber.model;

import javax.persistence.*;

@Entity
public class Car {
    @OneToOne(mappedBy = "car_id")
    private User user;

    public String getModel() {
        return model;
    }
    public int getSeries() {
        return series;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int series;
    private String model;

    public Car() {
    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }
}
