package lv.accenture.bootcamp.webdemo.repository;

import lv.accenture.bootcamp.webdemo.model.Cat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CatRepository {

    private List<Cat> cats = new ArrayList<>();

    public CatRepository(){
        cats.add(new Cat (1L, "Muris"));
        cats.add(new Cat (2L, "Mango"));
        cats.add(new Cat (3L, "Pinka"));
        cats.add(new Cat (4L, "Otto"));
        cats.add(new Cat (5L, "Stakato"));
        cats.add(new Cat (6L, "Dzingls"));
        cats.add(new Cat (7L, "Riepa"));
    }

    public List<Cat> findAll(){
        return cats;
    }
}
