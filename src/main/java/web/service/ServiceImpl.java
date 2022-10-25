package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
