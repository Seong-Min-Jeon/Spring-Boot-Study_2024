package com.seongmin.shop.controller;

import com.seongmin.shop.Hw;
import com.seongmin.shop.HwRepository;
import com.seongmin.shop.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class HwController {
    private final HwRepository hwRepository;

//    @GetMapping("/list")
//    String listHw(Model model) {
//        List<Hw> result = hwRepository.findAll();
//        model.addAttribute("items", result);
//        return "listHw.html";
//    }
//
//    @GetMapping("/write")
//    String writeHw(Model model) {
//        return "writeHw.html";
//    }
//
//    @PostMapping("/add")
//    String writeHwPost(@RequestParam Map<String, String> formData) {
//        Hw hw = new Hw();
//        hw.setTitle(formData.get("title"));
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            hw.setWrittenDate(formatter.parse(formData.get("writtenDate")));
//        } catch(Exception e) {
//
//        }
//
//        hwRepository.insertData(hw);
//        //hwRepository.save(hw); 하면 repository에 insert sql문 없이도 데이터 저장가능
//
//        return "redirect:/list";
//    }
//
//    @PostMapping("/addEx")
//    String writeHwPostEx(@ModelAttribute Hw hw) {
//        hwRepository.save(hw);
//        return "redirect:/list";
//    }
//
//    @GetMapping("/detail/{id}")
//    String detailHw(@PathVariable Long id, Model model) {
//        Optional<Hw> result = hwRepository.findById(id);
//        if(result.isPresent()) {
//            model.addAttribute("item", result.get());
//            return "detailHw.html";
//        } else {
//            return "redirect:/list";
//        }
//
//    }

}
