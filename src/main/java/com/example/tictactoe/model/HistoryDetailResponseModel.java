/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.model;

import lombok.Data;

/**
 *
 * @author Jaruwatj
 */
@Data
public class HistoryDetailResponseModel {

    private Long tableSize;
    private String history;

    public HistoryDetailResponseModel(Long tableSize, String history) {
        this.tableSize = tableSize;
        this.history = history;
    }
}
