/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.controller;

import com.example.tictactoe.repository.XOHistoryRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jaruwatj
 */
@Controller
public class Router {

    @Autowired
    private XOHistoryRepository repository;

    private Integer DEFAULT_TABLE_SIZE = 3;

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("tableSize", DEFAULT_TABLE_SIZE);
        return "index";
    }

    @PostMapping
    public String setTableSize(@RequestParam(required = false) String tableSize, Model model) {
        List<String> historyList = new ArrayList();
        repository.findAll().iterator().forEachRemaining((history) -> {
            System.out.println(history.getDate().toString());
            historyList.add(history.getDate().toString());
        });

        model.addAttribute("tableSize", Objects.nonNull(tableSize) && !tableSize.isEmpty() ? Integer.valueOf(tableSize) : DEFAULT_TABLE_SIZE);
        model.addAttribute("historyList", historyList);
        return "index";
    }
}
