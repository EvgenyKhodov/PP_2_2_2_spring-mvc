package web.dao;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    public static List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car("Ford Mustang", "black", "Dominic Toretto"));
        listCar.add(new Car("Ferrari ff", "red", "Bryan O'Conner"));
        listCar.add(new Car("Mercedes s-class", "white", "Matthew McConaughey"));
        listCar.add(new Car("BMW  5", "white", "Johnn Depp"));
        listCar.add(new Car("Chevrolet Impala 1967", "black", "Dean Winchester"));
    }

    public List<Car> numberOfCars(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }

}