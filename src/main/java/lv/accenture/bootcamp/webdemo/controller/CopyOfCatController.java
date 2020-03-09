//package lv.accenture.bootcamp.webdemo.controller;
//
//import lv.accenture.bootcamp.webdemo.model.Cat;
//import lv.accenture.bootcamp.webdemo.repository.CopyOfCatRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.bind.BindResult;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//public class CopyOfCatController {
//
//    @Autowired
//    private CopyOfCatRepository copyOfCatRepository;
//
//    @GetMapping("/cats")
//    public String catIndex(Model model) {
////        model.addAttribute("test", "it works!");
////        Cat cat = new Cat(1L, "Muris");
////        model.addAttribute("cat", cat);
////        model.addAttribute("id", cat);
//        List<Cat> cats = copyOfCatRepository.findAll();
//        model.addAttribute("test", "it works!");
//        Cat cat = new Cat(1L, "Muris", "3", "https://tinyurl.com/yxxofdoh");
//        model.addAttribute("cats", cats);
//        return "cats-index";
//    }
//
//    @GetMapping("/cats/add")
//    public String addCatPage(Model model) {
//        model.addAttribute("cat", new Cat());
//        return "add-cat";
//    }
//
//    @PostMapping("/cats/add-cat")
//    public String addCat(Cat catToAdd) {
//        copyOfCatRepository.add(catToAdd);
//        return "redirect:/cats";
//    }
//
//    @GetMapping("/cats/edit/{id}") //{id} - dinamiskais parametrs
//    public String editCatPage(@PathVariable Long id, Model model) {
//        // @PathVariable Long id // Spring anotacija @PathVariable pasaka, ka Long id vertiba ir ta, ko mes dabujam no {id}
//        Cat catToEdit = copyOfCatRepository.findById(id);
//        model.addAttribute("cat", catToEdit);
//        return "edit-cat";
//    }
//
//    @PostMapping("/cats/edit-cat/{id}")
//    public String editCat(@PathVariable Long id, Cat editedCat) {
//        editedCat.setId(id);
//        System.out.println("Changed id: " + editedCat.getId());
//        System.out.println("Changed nickname: " + editedCat.getNickname());
//        copyOfCatRepository.update(editedCat);
//        return "redirect:/cats";
//    }
//
//    @GetMapping("/cats/delete/{id}") //{id} - dinamiskais parametrs
//    public String deleteCat(@PathVariable Long id) {
//        // @PathVariable Long id // Spring anotacija @PathVariable pasaka, ka Long id vertiba ir ta, ko mes dabujam no {id}
//        copyOfCatRepository.delete(id);
//        return "redirect:/cats";
//    }
//    @GetMapping("/cats/search")
//    public String searchCats(@RequestParam String catName, Model model){
//        List<Cat> matchedCats = copyOfCatRepository.findByNickname(catName);
//        model.addAttribute("cats", matchedCats);
//        return "cats-index";
//    }
//}
