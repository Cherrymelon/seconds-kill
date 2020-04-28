package com.daydreamdev.secondskill.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author cherrymelon
 * @date 4/16 13:49
 */
@Getter
@Setter
public class StockOrder {

    private Integer id;

    private Integer sid;

    private String name;

    private Date createTime;
}
