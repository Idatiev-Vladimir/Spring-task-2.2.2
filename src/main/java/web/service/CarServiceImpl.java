package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = Arrays.asList(
                new Car("Toyota", "Camry", 2020),
                new Car("Volkswagen", "Polo", 2010),
                new Car("Lada", "Niva", 2005),
                new Car("Ford", "F-Series", 2008),
                new Car("Kia", "Sportage", 2016)
        );

        if (count >= 5) {
            return cars;
        }

        return cars.subList(0, count);
    }
}
