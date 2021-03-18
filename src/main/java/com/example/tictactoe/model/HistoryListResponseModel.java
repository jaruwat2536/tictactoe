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
public class HistoryListResponseModel {

    private long id;
    private String date;

    public HistoryListResponseModel(long id, String date) {
        this.id = id;
        this.date = date;
    }
}
