package com.seongmin.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;
    private final HwRepository hwRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        System.out.println(result.get(0).toString());

        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/list/hw")
    String listHw(Model model) {
        List<Hw> result = hwRepository.findAll();
        System.out.println(result.get(0).toString());

        model.addAttribute("items", result);
        return "listHw.html";
    }

}
