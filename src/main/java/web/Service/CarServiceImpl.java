package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> allCars;
    {
        allCars = new ArrayList<>();
        allCars.add(new Car(++CAR_COUNT,"Audi", "A3", "IV"));
        allCars.add(new Car(++CAR_COUNT, "Audi", "S3", "IV"));
        allCars.add(new Car(++CAR_COUNT, "Audi", "RS3", "IV"));
        allCars.add(new Car(++CAR_COUNT, "Audi", "A4", "B9"));
        allCars.add(new Car(++CAR_COUNT, "Audi", "RS4", "B9"));
    }
    @Override
    public List<Car> showCountCar(int count) {
        if(count > 0 && count < 5) {
            return allCars.stream().limit(count).toList();
        } else {
            return allCars;
        }
    }
}