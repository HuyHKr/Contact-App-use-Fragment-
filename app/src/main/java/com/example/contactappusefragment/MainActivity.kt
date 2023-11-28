package com.example.contactappusefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    var data = arrayListOf<Model>(Model("Phương Anh", "0987654321"),
        Model("Thành Long", "0909090909"),
        Model("Hồng Nhung", "0777123456"),
        Model("Đức An", "0369696969"),
        Model("Linh Chi", "0888123456"),
        Model("Minh Tâm", "0555123456"),
        Model("Thu Hiền", "0123456789"),
        Model("Quang Hải", "0345678901"),
        Model("Kim Ngọc", "0876543210"),
        Model("Vân Anh", "0912345678"),
        Model("Tuấn Kiệt", "0969696969"),
        Model("Hà An", "0999888777"),
        Model("Duy Khánh", "0898877665"),
        Model("Thu Phương", "0123456789"),
        Model("Hải Yến", "0383838383"),
        Model("Nhật Minh", "0777666555"),
        Model("Gia Hân", "0958585858"),
        Model("Quốc Tuấn", "0969696996"),
        Model("Anh Khoa", "0912912912"),
        Model("Ngọc Trâm", "0888777666"),
        Model("Thái Bình", "0333222111"),
        Model("Cẩm Tú", "0944094409"),
        Model("Hồng Phúc", "0123456789"),
        Model("Kiều Oanh", "0876543210"),
        Model("Văn Hùng", "0969696969"));
    fun addTolist(name:String,phoneNumber:String){
        data.add(Model(name,phoneNumber))

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        supportFragmentManager.findFragmentById(R.id.fragmentContainerView)?.findNavController()?.navigate(R.id.action_listFragment_to_addFragment)
        return super.onOptionsItemSelected(item)
    }

}