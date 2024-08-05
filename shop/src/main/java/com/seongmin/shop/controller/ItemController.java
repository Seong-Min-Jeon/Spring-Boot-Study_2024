package com.seongmin.shop.controller;

import com.seongmin.shop.Hw;
import com.seongmin.shop.HwRepository;
import com.seongmin.shop.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;
    private final HwRepository hwRepository;

//    @GetMapping("/list")
//    String list(Model model) {
//        List<Item> result = itemRepository.findAll();
//        System.out.println(result.get(0).toString());
//
//        model.addAttribute("items", result);
//        return "list.html";
//    }

    @GetMapping("/list")
    String listHw(Model model) {
        List<Hw> result = hwRepository.findAll();
        model.addAttribute("items", result);
        return "listHw.html";
    }

    @GetMapping("/write")
    String writeHw(Model model) {
        return "writeHw.html";
    }

    @PostMapping("/add")
    String writeHwPost(@RequestParam Map<String, String> formData) {
        Hw hw = new Hw();
        hw.setTitle(formData.get("title"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            hw.setWrittenDate(formatter.parse(formData.get("writtenDate")));
        } catch(Exception e) {

        }

        hwRepository.insertData(hw);
        return "redirect:/list";
    }
}
