//package lv.accenture.bootcamp.webdemo.repository;
//
//import lv.accenture.bootcamp.webdemo.model.Cat;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class CopyOfCatRepository {
//
//    private List<Cat> cats = new ArrayList<>();
//
//    public CopyOfCatRepository() {
//        cats.add(new Cat(1L, "Muris", "2", "https://tinyurl.com/t497lwo"));
//        cats.add(new Cat(2L, "Mango", "1", "https://tinyurl.com/rjvll5q"));
//        cats.add(new Cat(3L, "Pinkainis", "3", "https://static.boredpanda.com/blog/wp-content/uploads/2019/10/This-is-Rosie-Kittys-Story-5d9da3afa6819__700.jpg"));
//        cats.add(new Cat(4L, "Pinka", "1", "https://postmediatorontosun.files.wordpress.com/2019/07/gettyimages-910314172-e1564420108411.jpg"));
//        cats.add(new Cat(5L, "Stakato", "3", "https://www.rover.com/blog/wp-content/uploads/2019/11/bengal-cat-black-background-960x540.jpg"));
//        cats.add(new Cat(6L, "Dzingls", "2", "https://images.pexels.com/photos/617278/pexels-photo-617278.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
//        cats.add(new Cat(7L, "Riepa", "2", "https://cdn.pixabay.com/photo/2017/10/30/23/26/kitty-2903812_960_720.jpg"));
//    }
//
//    public List<Cat> findAll() {
//        return cats;
//    }
//
//    public void add(Cat cat) {
//        //find biggest id number and +1
//        //give new id to incoming cat
//        //add incoming cat to list
//        Long idMax = 0L;
//        for (Cat i : cats) {
//            if (i.getId() > idMax) {
//                idMax = i.getId();
//            }
//        }
//        idMax = idMax + 1;
//        cat.setId(idMax);
//        cats.add(cat);
//    }
//
//    public Cat findById(Long id) {
//        for (Cat i : cats) {
//            if (i.getId().equals(id)) {
//                return i; //apstadina ciklu
//            }
//        }
//        throw new IllegalArgumentException("cat by Id: " + id + "not found!"); //return null nav laba pieeja ;
//    }
//
//    public void update(Cat editedcat) {
//        //atrast originalo pec id
//        //aizvietot originalo vardu ar jaunu
//        //atrast poziciju,to izdzest un ta vieta ielikt jaunu
//        int i = 0;
//        for (i = 0; i < cats.size(); i++) {
//            Cat cat = cats.get(i); //atrodam vietu masiva, kur glabajas elements
//            if (cat.getId().equals(editedcat.getId())) {
//                cats.set(i, editedcat); // set aizvieto veco elementu ar jauno padoto
//                return; // partrauc ciklu un iziet no funkcijas(metodes Update) vispar. Break; partrauks ciklu un turpinas izpildit kodu, kas atrodas aiz cikla
//            }
//        }
//        throw new IllegalArgumentException("cat by Id: " + editedcat.getId() + "not found!");
//    }
//
//    public void delete(Long id) {
//        Cat cat = findById(id);
//        cats.remove(cat);
//    }
//
//    public List<Cat> findByNickname(String catName) {
//        int i = 0;
//        List<Cat> searchList = new ArrayList<Cat>();
//        for (i = 0; i < cats.size(); i++) {
//            Cat cat = cats.get(i);
//            if (cat.getNickname().toLowerCase().equals(catName.toLowerCase())) {
//                searchList.add(cat);
//            }
//        }
//        return searchList;
//    }
//}
//
