package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceImpl implements Service {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Vaz", 1, 1998));
        cars.add(new Car("Gaz", 2, 2001));
        cars.add(new Car("Lada", 3, 2005));
        cars.add(new Car("Largus", 4, 2014));
        cars.add(new Car("Uaz", 5, 1990));
    }

    @Override
    public List<Car> getAllCars(int count) {
        List<Car> carList = new ArrayList<>();
        if (count >= 5) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}
