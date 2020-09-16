package com.codegym.c0320h1.controller;

import com.codegym.c0320h1.model.Food;
import com.codegym.c0320h1.model.FoodOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/foodorder")
public class FoodController {


    @GetMapping()
    public ModelAndView createFood(){
        ModelAndView modelAndView = new ModelAndView("/food/create");
        modelAndView.addObject("foodOder", new FoodOrder());
        List<Food> listFood = new ArrayList<Food>();
        listFood.add(new Food(1, "Nem"));
        listFood.add(new Food(2, "Bun"));
        listFood.add(new Food(3, "Chao"));
        listFood.add(new Food(4, "Che"));
        modelAndView.addObject("foods",listFood);
        return modelAndView;
    }
}
