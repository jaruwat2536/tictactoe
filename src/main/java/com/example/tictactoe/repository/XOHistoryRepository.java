/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.tictactoe.entity.XOHistory;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jaruwatj
 */
@Repository
public interface XOHistoryRepository extends CrudRepository<XOHistory, Long> {

    @Override
    public List<XOHistory> findAll();
}
