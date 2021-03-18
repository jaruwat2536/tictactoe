/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.controller;

import com.example.tictactoe.repository.XOHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.tictactoe.entity.XOHistory;
import java.util.Date;

/**
 *
 * @author Jaruwatj
 */
@RestController
public class XOController {

    @Autowired
    private XOHistoryRepository historyRepository;

    @PostMapping("/saveHistory")
    public XOHistory saveHistory(@RequestParam String history) {
        XOHistory obj = new XOHistory();
        obj.setDate(new Date());
        obj.setHistory(history);
        return historyRepository.save(obj);
    }
}
