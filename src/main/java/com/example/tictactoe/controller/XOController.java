/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.tictactoe.model.HistoryDetailResponseModel;
import com.example.tictactoe.service.XOHistoryService;

/**
 *
 * @author Jaruwatj
 */
@RestController
public class XOController {

    @Autowired
    private XOHistoryService service;

    @PostMapping("/findHistoryDetail")
    public HistoryDetailResponseModel findHistoryDetail(@RequestParam Long id) {
        return service.getHistoryDetail(id);
    }
}
