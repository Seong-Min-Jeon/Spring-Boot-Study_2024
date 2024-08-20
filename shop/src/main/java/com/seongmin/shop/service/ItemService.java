package com.seongmin.shop.service;

import com.seongmin.shop.Item;
import com.seongmin.shop.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void saveItem(@RequestParam Map<String, String> formData) {
        Item item = new Item();
        String title = formData.get("title");
        if(title.length() > 10) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "이름은 10자 이내로"
            );
        }
        item.setTitle(title);
        item.setPrice(Integer.parseInt(formData.get("price")));

        itemRepository.save(item);
    }

}
