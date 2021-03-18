/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tictactoe.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Jaruwatj
 */
@Entity
@Data
public class XOHistory {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private Long tableSize;
    @Lob
    private String history;

    public XOHistory() {
        super();
    }

    public XOHistory(Long id, Date date, Long tableSize, String history) {
        super();
        this.id = id;
        this.date = date;
        this.tableSize = tableSize;
        this.history = history;
    }

}
