package com.zyb.kotlinlearn

import android.os.Build.VERSION_CODES.M
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_function_1.text = "点击事件的实现"  //set和get
        tv_function_1.setOnClickListener { tv_function_1.text = "已经点击了";toast(tv_function_1.text) }
        //集成Context的类洞可以使用扩展函数toast和longToast
        //变量的声明
        //var 变量声明语句   变量名 : 变量类型    Int Long  Double Float String Char
        var num: Int = 55

        //数据类型的转换  toInt toLong to Double toChar toFloat
        var str: String = num.toString();

        //数组  IntArray DoubleArray  LongArray
        //声明 初始化  intArrayOf doubleArrayOf floatArrayOf  chaArrayOf
        var int_arr: IntArray = intArrayOf(1, 2, 3)
        //不存在StringArray
        //字符串数组的声明   基本数据类型也可以
        var string_arry: Array<String> = arrayOf("a", "b")

        //集合的操作
        tv_function_2.text = "集合的操作"
        tv_function_2.setOnClickListener { toast("数组string_array的长度${string_arry.size}") }
        //数组的操作

        var message: String = string_arry[1]
        var message_second: String = string_arry[0]
        //字符的转换成其他类型 toInt toLong
        message.toCharArray()//
        //字符串的常用操作  与java 兼容个 index(),split() ,substring() replace(0

        //获取某一个位置的位置字符串
        var message_third: String = "welcome to china"
        var message_four: String = message_third[2].toString()
        //字符创模板的拼接
        //$变量名   系统会匹配最长的变量名  如果是先运算就添加大括号  对$进行转移\$才可以打印$
        message_four = "这个自字符串是拼接的$message_four"
        var message_four_1: String = "这个自字符串是拼接的${message_four.length}"


        //容器
        //集合set  队列List  映射Map
        //没类容器分为只读和可变两种类型
        //val 便是不可修改  var标识可以修改
        //容器默认只读
        // Mutable标识可变 MutableSet MutableList MutableMap
        val stateList: List<String> = listOf("第一个元素", "第二个元素", "第三个元素", "第四个元素")  //只读List
        val stmutable: MutableList<String> = mutableListOf("第一个元素", "第二个元素", "第三个元素", "第四个元素")

        //Set  是一种无序的,元素唯一性
        // MutableSet
        /**/ // 1. 通过add添加,但是不知道位置,
        // 2.无法修改元素一旦被添加就无法修改
        // 3.可以删除指定元素,但是不可以删除某一位置的元素

        var litString: String = ""

        //for in遍历
        for (item in stmutable) {
            litString = "$litString,$item${item.length}\n"  //\n是换行符
        }

        //迭代器的方式


    }
}
