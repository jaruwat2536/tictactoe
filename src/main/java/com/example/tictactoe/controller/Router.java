/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.controller;

import com.example.tictactoe.service.XOHistoryService;
import java.util.Objects;
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
    private XOHistoryService service;

    private Integer DEFAULT_TABLE_SIZE = 3;

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("tableSize", DEFAULT_TABLE_SIZE);
        model.addAttribute("historyList", service.getHistoryList());
        return "index";
    }

    @PostMapping
    public String setTableSize(@RequestParam(required = false) String tableSize, Model model) {
        model.addAttribute("tableSize", Objects.nonNull(tableSize) && !tableSize.isEmpty() ? Integer.valueOf(tableSize) : DEFAULT_TABLE_SIZE);
        model.addAttribute("historyList", service.getHistoryList());
        return "index";
    }

    @PostMapping("/refreshTable")
    public String refreshTable(@RequestParam String tableSize, Model model) {
        model.addAttribute("tableSize", tableSize);
        return "index::table";
    }

    @PostMapping("/saveHistory")
    public String saveHistory(@RequestParam String history, @RequestParam Long tableSize, Model model) {
        service.saveHistory(history, tableSize);
        model.addAttribute("historyList", service.getHistoryList());
        return "index::history";
    }

}
