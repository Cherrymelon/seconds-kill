package com.cherrymelon.secondskill.service.impl;

import com.cherrymelon.secondskill.dao.StockMapper;
import com.cherrymelon.secondskill.pojo.Stock;
import com.cherrymelon.secondskill.service.api.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cherrymelon
 * @date 4/19 21:41
 */
@Service(value = "StockService")
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public int getStockCount(int id) {
        Stock stock = stockMapper.selectByPrimaryKey(id);
        return stock.getCount();
    }

    @Override
    public Stock getStockById(int id) {

        return stockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStockById(Stock stock) {

        return stockMapper.updateByPrimaryKeySelective(stock);
    }

    @Override
    public int updateStockByOptimistic(Stock stock) {

        return stockMapper.updateByOptimistic(stock);
    }

    @Override
    public int initDBBefore() {

        return stockMapper.initDBBefore();
    }
}
