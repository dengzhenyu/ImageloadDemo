package com.example.demo.imageloaddemo

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.service.carrier.CarrierMessagingService
import android.widget.ImageView
import android.widget.Toast
import com.ss.android.caijing.stock.imageloader.ImageLoaderUtil
import com.ss.android.caijing.stock.imageloader.core.LoaderResultCallBack
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private val url = "https://static-ali.ihansen.org/app/bg1440/pJqfhKUpCh8.jpg"
    private val gif = "http://www.gif5.net/img/images/2016/07/20/NWFXOTU1eUw=.gif"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageView1: ImageView = findViewById(R.id.iv1)
        var imageView2: ImageView = findViewById(R.id.iv2)
        var imageView3: ImageView = findViewById(R.id.iv3)
        var mainActivity = this
        var person = Person("jijie", 24)
        print(person.name)
        print(person.age)
        ImageLoaderUtil.getInstance().with(this).imageUrl(url).resultCallBack(object :
            LoaderResultCallBack{
            override fun onFail(p0: Exception?) = Toast.makeText(mainActivity,"fail1",Toast.LENGTH_SHORT).show()

            override fun onSucc(p0: Drawable?) = Toast.makeText(mainActivity,"succ1",Toast.LENGTH_SHORT).show()

        }).imageView(imageView1).show()
        ImageLoaderUtil.getInstance().loadImage(url , imageView2)

//        ImageLoaderUtil.getInstance().with(this).imageUrl(url).isCircle().borderWidth(1).borderColor(R.color.colorPrimary).resultCallBack(object : LoaderResultCallBack{
//            override fun onFail(p0: Exception?) = Toast.makeText(mainActivity,"fail2",Toast.LENGTH_SHORT).show()
//
//            override fun onSucc(p0: Drawable?) = Toast.makeText(mainActivity,"succ2",Toast.LENGTH_SHORT).show()
//
//        }).imageView(imageView2).show()

        ImageLoaderUtil.getInstance().with(this).imageUrl(gif).resultCallBack(object :
            LoaderResultCallBack{
            override fun onFail(p0: Exception?) = Toast.makeText(mainActivity,"fail3",Toast.LENGTH_SHORT).show()

            override fun onSucc(p0: Drawable?) = Toast.makeText(mainActivity,"succ3",Toast.LENGTH_SHORT).show()

        }).imageView(imageView3).show()

        print("demo")
    }
}
