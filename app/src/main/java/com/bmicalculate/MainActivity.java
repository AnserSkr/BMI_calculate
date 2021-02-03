package com.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
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
        EditText editHeight = (EditText)findViewById(R.id.editHeight);
        EditText editWeight = (EditText)findViewById(R.id.editWeight);
        TextView textResult = (TextView)findViewById(R.id.textResult);
        Double height = Double.parseDouble(editHeight.getText().toString());
        Double weight = Double.parseDouble((editWeight.getText().toString()));
           /*
           体质指数（BMI)=体重( kg )÷身高^2 ( m )
           最理想的体重指数是22，BMI指数为18.5~23.9时属正常，具体分类如下︰
           过轻:低于18.5
           正常∶18.5-23.9
           过重:24-27.9
           肥胖:28-32
           非常肥胖,高于32
            */

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


}