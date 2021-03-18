/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.service.impl;

import com.example.tictactoe.repository.XOHistoryRepository;
import com.example.tictactoe.service.XOHistoryService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tictactoe.entity.XOHistory;
import com.example.tictactoe.model.HistoryListResponseModel;
import com.example.tictactoe.model.HistoryDetailResponseModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jaruwatj
 */
@Service
public class XOHistoryServiceImpl implements XOHistoryService {

    @Autowired
    private XOHistoryRepository repository;

    @Override
    public List<HistoryListResponseModel> getHistoryList() {
        List<HistoryListResponseModel> list = new ArrayList();
        repository.findAll().stream().sorted((o1, o2) -> o1.getId() < o2.getId() ? 1 : -1)
                .forEach(obj -> {
                    list.add(new HistoryListResponseModel(obj.getId(), obj.getDate().toString()));
                });
        return list;
    }

    @Override
    public HistoryDetailResponseModel getHistoryDetail(Long id) {
        Optional<XOHistory> opt = repository.findById(id);
        HistoryDetailResponseModel responseModel = new HistoryDetailResponseModel(3L, "");
        if (opt.isPresent()) {
            XOHistory obj = opt.get();
            responseModel.setTableSize(obj.getTableSize());
            responseModel.setHistory(obj.getHistory());
        }
        return responseModel;
    }

    @Override
    public XOHistory saveHistory(String history, Long tableSize) {
        XOHistory obj = new XOHistory();
        obj.setDate(new Date());
        obj.setHistory(history);
        obj.setTableSize(tableSize);
        return repository.save(obj);
    }

}
