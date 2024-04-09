package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServicelmpl implements CarService{
    private static int count;

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++count, "Toyota", 2023, "Белый"));
        cars.add(new Car(++count, "BMW", 2022, "Черный"));
        cars.add(new Car(++count, "Mercedes", 2021, "Синий"));
        cars.add(new Car(++count, "Audi", 2020, "Красный"));
        cars.add(new Car(++count, "Volkswagen", 2019, "Серый"));
    }
    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> show(Integer count) {
        return cars.subList(0, count);
    }
}
