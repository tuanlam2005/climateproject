package com.example.climate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QueryController {

    @Autowired
    private TempRep cityTempRep; // Assuming you have a repository to interact with the database

    @GetMapping("/all-city")
    public String showData(Model model) {
        List<Temperature> dataList = cityTempRep.findAllCities(); // Use your query method
        model.addAttribute("dataList", dataList);
        return "all-city";
    }
}