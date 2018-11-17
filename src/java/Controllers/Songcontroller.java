package Controllers;

import DAO.SongDAO;
import Songs.Mp3;
import Validators.MusicValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("test")
public class Songcontroller {

    @Autowired
    private SongDAO dao;

    @Autowired
    private MusicValidator musicvalidator;

//    @RequestMapping(value = "formpage")
//    public ModelAndView getuserform() {
//        Mp3 a = new Mp3();
//
//        ModelAndView mva = new ModelAndView("formpage");
//        mva.addObject("userEntity", a);
//        return mva;
//    }

    @RequestMapping(value = "formpage")
    public String check(Model model) {
        Mp3 m = new Mp3();
        model.addAttribute("userEntity", m);
        return "formpage";
    }

    @RequestMapping(value = "doLoginEmpty")
    public String authenticate(Model model,@ModelAttribute("userEntity") Mp3 mp3, BindingResult bindingResult) {
        musicvalidator.validate(mp3, bindingResult);
        if (bindingResult.hasErrors()) {
           // model.addAttribute("userEntity", mp3);
            return "formpage";

        }
        model.addAttribute("mp3", mp3);
        return "success";
    }

//    @RequestMapping(value = "findname1", method = RequestMethod.GET)
//    public String findname(ModelMap model, @RequestParam(value = "name") String name) {
//        Mp3 a = new Mp3();
//        model.addAttribute("list", dao.finder(name));
//
//        return "findname";
}
//forma pou vazw gramata kai kanw submit
//@RequestMapping(value = "formpage")
//    public String findname(ModelMap model) {
//
//        return "formpage";
//    }

