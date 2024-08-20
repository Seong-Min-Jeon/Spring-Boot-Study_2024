package com.seongmin.shop.controller;

import com.seongmin.shop.Item;
import com.seongmin.shop.ItemRepository;
import com.seongmin.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;
    private final ItemService itemService;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    String write(Model model) {
        return "write.html";
    }

    @PostMapping("/add")
    String writePost(@RequestParam Map<String, String> formData) {
        itemService.saveItem(formData);
        return "redirect:/list";
    }

//    @PostMapping("/addEx")
//    String writeHwPostEx(@ModelAttribute Item item) {
//        itemRepository.save(item);
//        return "redirect:/list";
//    }

    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) {
        Optional<Item> result = itemRepository.findById(id);
        if(result.isPresent()) {
            model.addAttribute("item", result.get());
            return "detail.html";
        } else {
            return "redirect:/list";
        }

    }

}
