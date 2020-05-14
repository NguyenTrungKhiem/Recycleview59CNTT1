package vn.edu.ntu.trungkhiem.recycleview59cntt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.edu.ntu.trungkhiem.controller.ICartcontroller;
import vn.edu.ntu.trungkhiem.model.product;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListProduct;
    ProductAdapter adapter;
    List<product> listProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
    }

    private void addView()
    {
        rvListProduct = findViewById(R.id.rvListProduct);
        rvListProduct.setLayoutManager(new LinearLayoutManager(this));
        ICartcontroller controller = (ICartcontroller) getApplication();
        listProducts = controller.getAProducts();
        adapter = new ProductAdapter(listProducts);
        rvListProduct.setAdapter(adapter);
    }

    private class ProductViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtName, txtPrice , txtDes;
        ImageView imAddToCart;
        public ProductViewHolder(@NonNull View iteamView)
        {
            super(iteamView);
            txtName = this.itemView.findViewById(R.id.textName);
            txtPrice = this.itemView.findViewById(R.id.textPrice);
            txtDes = this.itemView.findViewById(R.id.textDes);
            imAddToCart = this.itemView.findViewById(R.id.imAddToCart);
        }

        public void bind(product p)
        {
            txtName.setText(p.getName());
            txtPrice.setText(p.getPrice());
            txtDes.setText(p.getDes());
        }
    }

    private  class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>
    {
        List<product> listProducts;

        public ProductAdapter(List<product> listProducts) {
            listProducts = listProducts;
        }

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.product,parent,false);
            // view product layout đã thiết kế
            return new ProductViewHolder (view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.bind(listProducts.get(position));
        }

        @Override
        public int getItemCount() {
            return listProducts.size();
        }
    }

}
