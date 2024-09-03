package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import java.util.List;


@Controller
public class AppController {

    @Autowired
    private C1Service fservice;
    @Autowired
    private C2Service pservice;   
    @Autowired
    private TeamService team_service; 

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        System.out.println("----------------------------------------------------------");
        List<Team> course = team_service.listAll(); //course
        List<C1> c1_users = fservice.listAll(); //cours 1
        List<C2> c2_users = pservice.listAll(); //cours 2
        
        model.addAttribute("course", course); // index page
        model.addAttribute("c1_users", c1_users); // index page
        model.addAttribute("c2_users", c2_users); // index page
        System.out.println("cours 1: " + c1_users.size());
        System.out.println("cours 2: " + c2_users.size());
        System.out.println("course: " + course.size());

        return "index"; // home page
    }
    // to add a new course
      
    @RequestMapping("/new_course")
    public String ShowNewCourseForm(Model model) {
        Team team = new Team();
    

        model.addAttribute("team", team);
        return "new_course"; // new_c1user form
    }

    // to add a new student for course 1
    @RequestMapping("/new_c1user")
    public String ShowNewC1UserForm(Model model) {
        User user = new C1();
        user.setDtype("Course 1");

        model.addAttribute("user", user);
        return "new_c1user"; // new_c1user form
    }
    // to add a new student for cours 2
    @RequestMapping("/new_c2user")
    public String ShowNewC2UserForm(Model model) {
        User user = new C2();
        user.setDtype("Course 2");

        model.addAttribute("user", user);
        return "new_c2user"; // new_c2user form
    }    
       //to save a new course to the database      
       @RequestMapping(value = "/save_team", method = RequestMethod.POST) 
       public String saveCourse(@ModelAttribute("course") Team team){     
           team_service.save(team); //save to User table        
           System.out.println("write to the team  table (c1).");
   
           return "redirect:/"; //return to index page  
       }
    
    //to save a new c1 user to the database      
    @RequestMapping(value = "/save_c1user", method = RequestMethod.POST) 
    public String saveC1User(@ModelAttribute("c1user") C1 c1user){     
        fservice.save(c1user); //save to User table        
        System.out.println("write to the user  table (c1).");
    
        return "redirect:/"; //return to index page  
    }

    //to save a new c2 user to the dtabase      
    @RequestMapping(value = "/save_c2user", method = RequestMethod.POST) 
    public String saveC2User(@ModelAttribute("c2user") C2 c2user){     
        pservice.save(c2user); //save to User table
        System.out.println("write to the user table (c2).");

         return "redirect:/"; //return to index page  
    }

            //to update a course in the database
            @RequestMapping("/edit_course")
            public ModelAndView showEditCourse(@PathVariable(name = "dtype") String dtype) {
                ModelAndView mav = new ModelAndView("edit_course"); // edit_course form
                Team team  = team_service.get(dtype);  
                mav.addObject("team", team);
                return mav;
            }
    //to update a C1 user in the database
    @RequestMapping("/edit_c1user/{mode}")
    public ModelAndView showEditC1UserPage(@PathVariable(name = "mode") String mode) {
        ModelAndView mav = new ModelAndView("edit_c1user"); // edit_c1user form
        User user  = fservice.get(mode);  
        mav.addObject("c1user", user);
        return mav;
    }

    //to update a C2 user in the database
    @RequestMapping("/edit_c2user/{mode}")
    public ModelAndView showEditC2UserPage(@PathVariable(name = "mode") String mode) {
        ModelAndView mav = new ModelAndView("edit_c2user"); // edit_c2user form
        User user  = pservice.get(mode);  
        mav.addObject("c2user", user);

        return mav;
    } 
    
       //to delete a course from the database
       @RequestMapping("/delete_team/{name}")
       public String deleteCourse(@PathVariable(name = "name") String name) {
           team_service.delete(name); //delete user from user table
        
           System.out.println("delete a course. ");
   
           return "redirect:/"; //return to index page      
       } 
    //to delete a C1 user from the database
    @RequestMapping("/delete_c1user/{username}")
    public String deleteC1User(@PathVariable(name = "username") String username) {
        fservice.delete(username); //delete user from user table
     
        System.out.println("delete a c1 user. ");

        return "redirect:/"; //return to index page      
    }   

    //to delete a C2 user from the database
    @RequestMapping("/delete_c2user/{username}")
    public String deleteC2User(@PathVariable(name = "username") String username) {
        pservice.delete(username); //delete user from user table

        System.out.println("delete a c2 user. ");

        return "redirect:/"; //return to index page      
    }   
}
