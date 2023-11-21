package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Volvo S60", "black", 2018));
        carList.add(new Car("BMW X5", "white", 2015));
        carList.add(new Car("Chery Tiggo 4 Pro", "red", 2021));
        carList.add(new Car("Lada 2114", "silver", 2012));
        carList.add(new Car("Volkswagen Touareg", "blue", 2013));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
