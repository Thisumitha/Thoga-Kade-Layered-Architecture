package bo.Customer.impl;

import bo.Customer.OrderBo;
import dao.custom.OrderDao;
import dao.custom.impl.OrderDaoImpl;
import dto.OrderDto;

import java.sql.SQLException;

public class OrderBoImpl implements OrderBo {

    private OrderDao orderDao =new OrderDaoImpl();



    @Override
    public boolean saveOreder(OrderDto dto) throws SQLException, ClassNotFoundException {
        return orderDao.saveCompleteOrder(dto);
    }

    public String generateId(){
        try {
            String id = orderDao.lastOrder().getOrderId();
            if (id!=null){

                int num = Integer.parseInt(id.split("[D]")[1]);
                num++;
                return String.format("D%03d",num);
            }else{
                return "D001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
