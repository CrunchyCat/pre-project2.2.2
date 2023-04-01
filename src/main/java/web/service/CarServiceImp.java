package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private CarDAO carDAO;
    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    //Работа со списком машин
    @Override
    public List<Car> returnGivenNumberCars(int n) {
        if(n < carDAO.returnCars().size()) {
            return carDAO.returnCars().stream().limit(n).collect(Collectors.toList());
        }
        return carDAO.returnCars();
    }


}
