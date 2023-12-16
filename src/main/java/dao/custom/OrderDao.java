package dao.custom;


import dao.CrudDao;
import dto.OrderDto;
import entity.orders;

import java.sql.SQLException;

public interface OrderDao  extends CrudDao<OrderDto> {

    OrderDto lastOrder() throws SQLException, ClassNotFoundException;

    boolean saveCompleteOrder(OrderDto dto) throws SQLException;
}