/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.service;

import com.example.tictactoe.entity.XOHistory;
import java.util.List;
import com.example.tictactoe.model.HistoryListResponseModel;
import com.example.tictactoe.model.HistoryDetailResponseModel;

/**
 *
 * @author Jaruwatj
 */
public interface XOHistoryService {

    public List<HistoryListResponseModel> getHistoryList();

    public HistoryDetailResponseModel getHistoryDetail(Long id);

    public XOHistory saveHistory(String history, Long tableSize);
}
