package com.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

    //onclick()的点击事件
    public void BtnBimcalc_Click(View v){
        //控件读取
        EditText editHeight = (EditText)findViewById(R.id.editHeight);
        EditText editWeight = (EditText)findViewById(R.id.editWeight);
        TextView textResult = (TextView)findViewById(R.id.textResult);
        //数值获取
        Double height = Double.parseDouble(editHeight.getText().toString());
        Double weight = Double.parseDouble((editWeight.getText().toString()));
        //数值计算
        Double bmi = weight/(height*height);//
        CheckBox cbWHO = (CheckBox)findViewById(R.id.cbWHO);
        CheckBox cbAria = (CheckBox)findViewById(R.id.cbAria);
        CheckBox cbChina = (CheckBox)findViewById(R.id.cbChina);
        TextView TextResultmass = (TextView)findViewById(R.id.textResult);
        String ResultMass = "";
        if(cbWHO.isChecked()){
            if(bmi<18.5){
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 偏瘦\n";
            }else if (bmi<24.9){
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 正常\n";
            }else if (bmi<29.9){
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 偏胖\n";
            }else if (bmi<34.9){
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 肥胖\n";
            }else if(bmi<39.9){
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 重度肥胖\n";
            }else {
                ResultMass += "WHO标准BMI:"+bmi.toString()+"  体型 极度重度肥胖\n";
            }
        }
        if(cbAria.isChecked()){
            if(bmi<18.5){
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 偏瘦\n";
            }else if (bmi<22.9){
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 正常\n";
            }else if (bmi<24){
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 偏胖\n";
            }else if (bmi<29.9){
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 肥胖\n";
            }else if(bmi<39.9){
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 重度肥胖\n";
            }else {
                ResultMass += "亚洲标准BMI:"+bmi.toString()+"  体型 极度重度肥胖\n";
            }
        }
        if (cbChina.isChecked()){
            if(bmi<18.5){
                ResultMass += "中国标准BMI:"+bmi.toString()+"  体型 偏瘦\n";
            }else if (bmi<23.9){
                ResultMass += "中国标准BMI:"+bmi.toString()+"  体型 正常\n";
            }else if (bmi<27.9){
                ResultMass += "中国标准BMI:"+bmi.toString()+"  体型 偏胖\n";
            }else if (bmi<32){
                ResultMass += "中国标准BMI:"+bmi.toString()+"  体型 肥胖\n";
            }else {
                ResultMass += "中国标准BMI:"+bmi.toString()+"  体型 重度肥胖\n";
            }
        }

        TextResultmass.setText(ResultMass);
    }


}