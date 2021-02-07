package com.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //监听事件
        /*//事件监听器
        Button btnBmiCalc = (Button)findViewById(R.id.btnBimCalc);
        btnBmiCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editHeight = (EditText)findViewById(R.id.editHeight);
                EditText editWeight = (EditText)findViewById(R.id.editWeight);
                TextView textResult = (TextView)findViewById(R.id.textResult);
                Double height = Double.parseDouble(editHeight.getText().toString());
                Double weight = Double.parseDouble((editWeight.getText().toString()));
           *//*
           体质指数（BMI)=体重( kg )÷身高^2 ( m )
           最理想的体重指数是22，BMI指数为18.5~23.9时属正常，具体分类如下︰
           过轻:低于18.5
           正常∶18.5-23.9
           过重:24-27.9
           肥胖:28-32
           非常肥胖,高于32
       *//*
                Double bmi = weight/(height*2);
                if(bmi<18.5){
                    textResult.setText("BMI:"+bmi.toString()+"体型 过轻");
                }else if (bmi<23.9){
                    textResult.setText("BMI:"+bmi.toString()+"体型 正常");
                }else if (bmi<27){
                    textResult.setText("BMI:"+bmi.toString()+"体型 过重");
                }else if (bmi<32){
                    textResult.setText("BMI:"+bmi.toString()+"体型 肥胖");
                }else {
                    textResult.setText("BMI:"+bmi.toString()+"体型 非常肥胖");
                }

            }
        });
    }
*/




    //设置全局变量
    String BmiMass = " ";//BMI:数值
    int i =0;//用于控制调用方法steResult()输出Result的内容信息
    String ResultmMass=" ";//输出结论内容
    String ResultMass2=" ";//输出警告内容

    //控件获取


    //点击检测与显示
    public void logical(int i){
        //控件读取
        EditText editHeight = (EditText)findViewById(R.id.editHeight);
        EditText editWeight = (EditText)findViewById(R.id.editWeight);
        TextView textResult = (TextView)findViewById(R.id.textResult);
        //数值获取
        Double height = Double.parseDouble(editHeight.getText().toString());
        Double weight = Double.parseDouble((editWeight.getText().toString()));

        Double bmi = weight/(height*height);
        RadioButton radiobtnWHO = (RadioButton)findViewById(R.id.radioButWHO);
        RadioButton radioBtnArea = (RadioButton)findViewById(R.id.radioButAric);
        RadioButton radioBtnChina = (RadioButton)findViewById(R.id.radioButChina);
        TextView textResult2 = (TextView)findViewById(R.id.textResult2);
        RadioButton lbDisplayBMI = (RadioButton)findViewById(R.id.raBtnBmi);
        RadioButton lbDisplayResult = (RadioButton)findViewById(R.id.raBtnResult);
        RadioButton lbDisplayBoth = (RadioButton)findViewById(R.id.raBtnBoth);
        if(lbDisplayBMI.isChecked()) {
            BmiMass = "BMI:"+bmi.toString();
            setResultMass2(i);//为警告赋值
            textResult.setText(BmiMass+ResultmMass);
            textResult2.setText(ResultMass2);
            clearDate();//清空数据
        }else if (lbDisplayResult.isChecked()){
            setResultMass(i);//为体型赋值
            setResultMass2(i);//为警告赋值
            textResult.setText(BmiMass+ResultmMass);
            textResult2.setText(ResultMass2);
            clearDate();//清空数据
        }else if(lbDisplayBoth.isChecked()){
            BmiMass = "BMI:"+bmi.toString();
            setResultMass(i);//为体型赋值
            setResultMass2(i);//为警告赋值
            textResult.setText(BmiMass+ResultmMass);
            textResult2.setText(ResultMass2);
            clearDate();//清空数据
        }
    }
    //onclick()的点击事件
    public void BtnBimcalc_Click(View v){
        //控件读取
        EditText editHeight = (EditText)findViewById(R.id.editHeight);
        EditText editWeight = (EditText)findViewById(R.id.editWeight);
        TextView textResult = (TextView)findViewById(R.id.textResult);
        //数值获取
        Double height = Double.parseDouble(editHeight.getText().toString());
        Double weight = Double.parseDouble((editWeight.getText().toString()));

        Double bmi = weight/(height*height);//
        RadioButton radiobtnWHO = (RadioButton)findViewById(R.id.radioButWHO);
        RadioButton radioBtnArea = (RadioButton)findViewById(R.id.radioButAric);
        RadioButton radioBtnChina = (RadioButton)findViewById(R.id.radioButChina);
        if(radiobtnWHO.isChecked()){
            if(bmi<18.5){
                i=1;
                logical(i);
            }else if (bmi<24.9){
                i=2;
                logical(i);
            }else if (bmi<29.9){
                i=3;
                logical(i);
            }else if (bmi<34.9){
                i=4;
                logical(i);
            }else if(bmi<39.9){
                i=5;
                logical(i);
            }else {
                i=6;
                logical(i);
            }
        }else if(radioBtnArea.isChecked()){
            if(bmi<18.5){
                i=1;
                logical(i);
            }else if (bmi<22.9){
                i=2;
                logical(i);
            }else if (bmi<24){
                i=3;
                logical(i);
            }else if (bmi<29.9){
                i=4;
                logical(i);
            }else if(bmi<39.9){
                i=5;
                logical(i);
            }else {
                i=6;
                logical(i);
            }
        }else if (radioBtnChina.isChecked()){
            if(bmi<18.5){
                i=1;
                logical(i);
            }else if (bmi<23.9){
                i=2;
                logical(i);
            }else if (bmi<27.9){
                i=3;
                logical(i);
            }else if (bmi<32){
                i=4;
                logical(i);
            }else {
                i=5;
                logical(i);
            }
        }else {
            textResult.setText("未选择BMI国际标准，请选中后继续使用");
        }
    }

    //使用switch为体型内容赋值
    protected  void setResultMass(int i){
        switch(i) {
            case 1:
                ResultmMass = "  体型 偏瘦";
                break;
            case 2:
                ResultmMass = "  体型 正常";
                break;
            case 3:
                ResultmMass = "  体型 偏胖";
                break;
             case 4:
                ResultmMass = "  体型 肥胖";
                break;
            case 5:
                ResultmMass = "  体型 重度肥胖";
                break;
            case 6:
                ResultmMass = "  体型 极度重度肥胖";
                break;
        }
    }

    //使用switch为警告内容赋值
    protected void setResultMass2(int i){
        switch(i) {
            case 1:
                ResultMass2 = "低(但其他疾病风险增加)";
                break;
            case 2:
                ResultMass2 = "平均水平";
                break;
            case 3:
                ResultMass2 = "增加";
                break;
            case 4:
                ResultMass2 = "中度增加";
                break;
            case 5:
                ResultMass2 = "严重增加";
                break;
            case 6:
                ResultMass2 = "非常严重增加";
                break;
        }
    }

    //清空内容数据
    protected void clearDate(){
        BmiMass = " ";//BMI:数值
        i =0;//用于控制调用方法steResult()输出Result的内容信息
        ResultmMass=" ";//输出结论内容
        ResultMass2=" ";//输出警告内容
    }
}