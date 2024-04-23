package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars (Integer count){
        cars.add(new Car("Audi","Black",25000));
        cars.add(new Car("Lada","green",11000));
        cars.add(new Car("Bentley","Yellow",70000));
        cars.add(new Car("Pegeout","Black",18000));
        cars.add(new Car("BMW","Black",47000));
        return cars.stream().limit(count).collect(Collectors.toList());

    }
}
