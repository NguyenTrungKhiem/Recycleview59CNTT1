package vn.edu.ntu.trungkhiem.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.trungkhiem.controller.ICartcontroller;
import vn.edu.ntu.trungkhiem.model.product;

public class Cartcontroller extends Application implements ICartcontroller
{
    List<product> listProducts = new ArrayList<>();

    public Cartcontroller()
    {
        listProducts.add(new product("Khoai Lang",2500,"Khoai lang tieu chuan"));
        listProducts.add(new product("Khoai Tây",3000,"Khoai Tây tieu chuan"));
        listProducts.add(new product("Táo",5000,"Táo tieu chuan"));
        listProducts.add(new product("Sầu riêng",15500,"Sầu riêng tieu chuan"));
        listProducts.add(new product("Bưởi",5000,"Bưởi tieu chuan"));
        listProducts.add(new product("Chuối",2000,"Chuối tieu chuan"));
    }


    @Override
    public List<product> getAProducts() {
        return listProducts;
    }
}
