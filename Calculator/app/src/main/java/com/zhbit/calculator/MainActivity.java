package com.zhbit.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private double num1; //第一个输入的数
    private double num2;//第二个输入的数
    private double M=0; //存放MC一类的数
    private TextView txt;
    private boolean over = false;
    private Spinner spinner01,spinner02;
    private ArrayAdapter<String> adapter01,adapter02 ;
    private boolean add,minus,ride,divide,quyu,qiudaoshu,kaigen,zhengfuhao,point=false ;
    private int way = 10;//控制运算
    private  static final  String[] m ={"标准型","程序员型"};
    private  static final  String[] n ={"十进制","八进制","二进制","十六进制"};
    private  Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd , btnMinus,
            btnRide , btnDivide,btn取余,btn求倒数, btn开根, btn正负号 , btnPoint,btnEqual, btnDelete,
            btnCE,btnCC, btnMC, btnMR, btnMS,btnMAdd, btnMMinus, btnA, btnB , btnC, btnD, btnE, btnF;

    //设置监听事件
    private View.OnClickListener myListener = new View.OnClickListener(){


        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn1:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"1");
                        over= false;
                    }
                    break;
                case R.id.btn0:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14) {
                       if(judgezero()==0)
                           txt.setText(txt.getText()+"0");
                        over= false;
                    }
                    break;
                case R.id.btn2:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"2");
                        over= false;
                    }
                    break;
                case R.id.btn3:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"3");
                        over= false;
                    }
                    break;
                case R.id.btn4:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"4");
                        over= false;
                    }
                    break;
                case R.id.btn5:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"5");
                        over= false;
                    }
                    break;
                case R.id.btn6:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"6");
                        over= false;
                    }
                    break;
                case R.id.btn7:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"7");
                        over= false;
                    }
                    break;
                case R.id.btn8:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"8");
                        over= false;
                    }
                    break;
                case R.id.btn9:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"9");
                        over= false;
                    }
                    break;
                case R.id.btnA:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"a");
                        over= false;
                    }
                    break;
                case R.id.btnB:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"b");
                        over= false;
                    }
                    break;
                case R.id.btnC:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"c");
                        over= false;
                    }
                    break;
                case R.id.btnD:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"d");
                        over= false;
                    }
                    break;
                case R.id.btnE:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"e");
                        over= false;
                    }
                    break;
                case R.id.btnF:
                    if(over)
                        txt.setText("");
                    if(txt.getText().length()<14){
                        if(judgezero()==0)
                            txt.setText(txt.getText()+"f");
                        over= false;
                    }
                    break;

                case R.id.btnPoint:
                    if(txt.getText().length()<14){
                        if(!(txt.getText().equals("")))
                            txt.setText(txt.getText()+".");
                        over= false;
                    }
                    break;

                //m一类的
                case R.id.btnMC:
                    M=0;
                    break;
                case R.id.btnMS:
                    if(txt.getText().length()<14){
                        if(!(txt.getText().equals(""))){
                            if(way==10||way==11)
                                M=Double.parseDouble(txt.getText()+"");
                            else if(way==8)
                                M=Double.parseDouble(toD(txt.getText()+"",8));
                            else if(way==2)
                                M=Double.parseDouble(toD(txt.getText()+"",2));
                            else if(way==16)
                                M=Double.parseDouble(toD(txt.getText()+"",16));
                        }

                        over= false;
                    }
                    break;
                case R.id.btnMR:
                    if(way==10||way==11)
                        txt.setText(delete(M+""));
                    if(way==8)
                        txt.setText(DtoOCT(delete(M+"")));
                    if(way==2)
                        txt.setText(DtoBT(delete(M+"")));
                    if(way==16)
                        txt.setText(DtoH(delete(M+"")));

                    break;

                case R.id.btnMAdd:
                    if(way==10||way==11)
                        M = M + Double.parseDouble(txt.getText()+"");
                    if(way==8)
                        M = M + Double.parseDouble(toD(txt.getText()+"",8));
                    if(way==2)
                        M = M + Double.parseDouble(toD(txt.getText()+"",2));
                    if(way==16)
                        M = M + Double.parseDouble(toD(txt.getText()+"",16));

                    break;

                case R.id.btnMMinus:
                    if(way==10||way==11)
                        M = M - Double.parseDouble(txt.getText()+"");
                    else if(way==8)
                        M = M - Double.parseDouble(toD(txt.getText()+"",8));
                    else if(way==2)
                        M = M - Double.parseDouble(toD(txt.getText()+"",2));
                    else if(way==16)
                        M = M - Double.parseDouble(toD(txt.getText()+"",16));

                    break;





                //这里开始是符号
                case R.id.btnAdd:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    add=true;
                    break;
                case R.id.btnMinus:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    minus=true;
                    break;
                case R.id.btnRide:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    ride=true;
                    break;
                case R.id.btnDivide:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    divide=true;
                    break;
                case R.id.btn取余:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    quyu=true;
                    break;
                case R.id.btn开根:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    num1 = Math.sqrt(num1);
                    txt.setText(delete(num1+""));
                    resetall();
                    kaigen=true;
                    break;
                case R.id.btn正负号:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    txt.setText("");
                    resetall();
                    zhengfuhao=true;
                    break;
                case R.id.btn求倒数:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num1 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num1 = Double.parseDouble(txt.getText() + "");
                        }
                    }
                    num1 = 1/num1;
                    txt.setText(delete(num1+""));
                    resetall();
                    qiudaoshu=true;
                    break;
                case R.id.btnccc:
                    num1=0;
                    num2=0;
                    resetall();
                    txt.setText("");
                    break;
                case R.id.btnce:
                    txt.setText("");
                    break;
                case R.id.btnDelete:
                    if(txt.getText().length()>0){
                        String result = (String) txt.getText();
                        result = result.substring(0,result.length()-1);
                        txt.setText(result);
                    }
                    break;

                //这里开始是运算
                case R.id.btnEqual:
                    if (!(txt.getText()==null||txt.getText().equals(""))) {
                        if (way == 16) {
                            num2 = Double.parseDouble(toD(txt.getText() + "", 16));
                        } else {
                            num2 = Double.parseDouble(txt.getText() + "");
                        }
                    }

                    if(add){
                        if(way==2){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))+Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoBT(sum));
                        }
                        if (way==8){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))+Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoOCT(sum));
                        }
                        if (way==16){
                            String sum = (num1+num2)+"";
                            sum = delete(sum);
                            txt.setText(DtoH(sum));
                        }

                        if(way==10||way==11){
                            String sum = (num1+num2)+"";
                            sum = delete(sum);
                            txt.setText(sum);
                        }
                    }else if(minus){
                        if(way==2){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))-Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoBT(sum));
                        }
                        if (way==8){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))-Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoOCT(sum));
                        }
                        if(way==10||way==11){
                            String sum = (num1-num2)+"";
                            sum = delete(sum);
                            txt.setText(sum);
                        }
                    }else if(ride){
                        if(way==2){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))*Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoBT(sum));
                        }
                        if (way==8){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))*Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoOCT(sum));
                        }
                        if(way==10||way==11){
                            String sum = (num1*num2)+"";
                            sum = delete(sum);
                            txt.setText(sum);
                        }
                    }else if(divide){
                        if(way==2){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))/Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoBT(sum));
                        }
                        if (way==8){
                            String sum = (Double.valueOf(toD(delete(num1+""),2))/Double.valueOf(toD(delete(num2+""),2)))+"";
                            sum = delete(sum);
                            txt.setText(DtoOCT(sum));
                        }
                        if(way==10||way==11){
                            String sum = (num1/num2)+"";
                            sum = delete(sum);
                            txt.setText(sum);
                        }
                    }else if(quyu){
                        String sum = (num1%num2)+"";
                        sum = delete(sum);
                        txt.setText(sum);
                    }
                    over= true;
                    break;

                default:
                    break;
            }

        }
    };
    //给按钮设置监听事件
    public void init(){
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(myListener);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(myListener);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(myListener);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(myListener);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(myListener);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(myListener);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(myListener);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(myListener);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(myListener);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(myListener);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(myListener);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(myListener);
        btnRide = (Button) findViewById(R.id.btnRide);
        btnRide.setOnClickListener(myListener);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(myListener);
        btn取余 = (Button) findViewById(R.id.btn取余);
        btn取余.setOnClickListener(myListener);
        btn求倒数 = (Button) findViewById(R.id.btn求倒数);
        btn求倒数.setOnClickListener(myListener);
        btn开根 = (Button) findViewById(R.id.btn开根);
        btn开根.setOnClickListener(myListener);
        btn正负号 = (Button) findViewById(R.id.btn正负号);
        btn正负号.setOnClickListener(myListener);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(myListener);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(myListener);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(myListener);
        btnCE = (Button) findViewById(R.id.btnce);
        btnCE.setOnClickListener(myListener);
        btnCC = (Button) findViewById(R.id.btnccc);
        btnCC.setOnClickListener(myListener);

        btnMC = (Button) findViewById(R.id.btnMC);
        btnMC.setOnClickListener(myListener);
        btnMR = (Button) findViewById(R.id.btnMR);
        btnMR.setOnClickListener(myListener);
        btnMS = (Button) findViewById(R.id.btnMS);
        btnMS.setOnClickListener(myListener);
        btnMAdd = (Button) findViewById(R.id.btnMAdd);
        btnMAdd.setOnClickListener(myListener);
        btnMMinus = (Button) findViewById(R.id.btnMMinus);
        btnMMinus.setOnClickListener(myListener);

        btnA = (Button) findViewById(R.id.btnA);
        btnA.setOnClickListener(myListener);
        btnB = (Button) findViewById(R.id.btnB);
        btnB.setOnClickListener(myListener);
        btnC = (Button) findViewById(R.id.btnC);
        btnC.setOnClickListener(myListener);
        btnD = (Button) findViewById(R.id.btnD);
        btnD.setOnClickListener(myListener);
        btnE = (Button) findViewById(R.id.btnE);
        btnE.setOnClickListener(myListener);
        btnF = (Button) findViewById(R.id.btnF);
        btnF.setOnClickListener(myListener);






    }

    //切换状态

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txt = (TextView) findViewById(R.id.txtShow);

        init();

        spinner01 = (Spinner) findViewById(R.id.spinner01);
        spinner02 = (Spinner) findViewById(R.id.spinner02);
        adapter01 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,m);//把数组放进去
        adapter02 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,n);//把数组放进去
        adapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter02.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner01.setAdapter(adapter01);
        spinner02.setAdapter(adapter02);
        spinner01.setOnItemSelectedListener(new SpinnerSelectedListener01());
        spinner02.setOnItemSelectedListener(new SpinnerSelectedListener02());


    }

    //第一个spinner的监听事件
    class SpinnerSelectedListener01 implements OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3){
            if(arg2==0){
                way=10;
                Toast toast = Toast.makeText(MainActivity.this,"标准型",Toast.LENGTH_LONG);
                toast.show();
                time(10);

            }

            if(arg2==1){
                way=11;
                Toast toast = Toast.makeText(MainActivity.this,"程序员型",Toast.LENGTH_LONG);
                toast.show();
                time(11);

            }

        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    //第二个spinner的监听（进制选择）
    class SpinnerSelectedListener02 implements OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3){
            if(arg2==0){
                if(way==10){
                    way=10;
                }else{
                    way=11;
                }
            }

            if(arg2==1){
                way=8;
                time(8);
                resetall();
                num1=0;
                num2=0;
                txt.setText("");

            }
            if (arg2==2){
                way=2;
                time(2);
                resetall();
                num1=0;
                num2=0;
                txt.setText("");
            }
            if(arg2==3){
                way=16;
                time(16);
                resetall();
                num1=0;
                num2=0;
                txt.setText("");
            }

        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    //这里写一个方法去掉后面多余的0
    private String delete(String s){
        if(s.indexOf(".") > 0){
            //正则表达
            s = s.replaceAll("0+?$", "");//去掉后面无用的零
            s = s.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点

        }
        if(s.length()>14){
            s = s.substring(0,14);
        }

        return s;
    }

    //重置所有运算符号
    private void resetall(){
        add=false ;
        minus=false ;
        ride=false ;
        divide=false ;
        quyu=false ;
        qiudaoshu=false ;
        kaigen=false ;
        zhengfuhao=false ;
        point=false ;
    }

    private int judgezero(){

        String zero="0";

        String s = txt.getText().toString().trim();


        if(zero.equals(s))   //这里断点测试过，s明明等于0， 但是他却判断不等于，return false？？？？？
            return 1;
        return 0;
    }

    private  void time(int i){
        switch (i){
            case 10:
                resetbtn();
                btnA.setClickable(false);
                btnB.setClickable(false);
                btnC.setClickable(false);
                btnD.setClickable(false);
                btnE.setClickable(false);
                btnF.setClickable(false);
                spinner02.setEnabled(false);
                break;
            case 11:
                resetbtn();
                btnA.setClickable(false);
                btnB.setClickable(false);
                btnC.setClickable(false);
                btnD.setClickable(false);
                btnE.setClickable(false);
                btnF.setClickable(false);
                btn取余.setClickable(false);
                btn开根.setClickable(false);
                btn正负号.setClickable(false);
                btn求倒数.setClickable(false);
                btnPoint.setClickable(false);
                spinner02.setEnabled(true);
                spinner02.setSelection(0);
                break;
            case 2:
                resetbtn();
                btnA.setClickable(false);
                btnB.setClickable(false);
                btnC.setClickable(false);
                btnD.setClickable(false);
                btnE.setClickable(false);
                btnF.setClickable(false);
                btn取余.setClickable(false);
                btn开根.setClickable(false);
                btn正负号.setClickable(false);
                btn求倒数.setClickable(false);
                btnPoint.setClickable(false);
                spinner02.setClickable(true);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                btn9.setClickable(false);
                break;
            case 8:
                resetbtn();
                btnA.setClickable(false);
                btnB.setClickable(false);
                btnC.setClickable(false);
                btnD.setClickable(false);
                btnE.setClickable(false);
                btnF.setClickable(false);
                btn取余.setClickable(false);
                btn开根.setClickable(false);
                btn正负号.setClickable(false);
                btn求倒数.setClickable(false);
                btn8.setClickable(false);
                btn9.setClickable(false);
                btnPoint.setClickable(false);
                spinner02.setEnabled(true);
                break;
            case 16:
                resetbtn();
                btn取余.setClickable(false);
                btn开根.setClickable(false);
                btn正负号.setClickable(false);
                btn求倒数.setClickable(false);
                spinner02.setEnabled(true);
                btnPoint.setClickable(false);
                break;

        }
    }

    //把所有按钮重置为true
    public void resetbtn(){
        btn0.setClickable(true);
        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
        btn5.setClickable(true);
        btn6.setClickable(true);
        btn7.setClickable(true);
        btn8.setClickable(true);
        btn9.setClickable(true);
        btnAdd.setClickable(true);
        btnMinus.setClickable(true);
        btnRide.setClickable(true);
        btnDivide.setClickable(true);
        btn取余.setClickable(true);
        btn求倒数.setClickable(true);
        btn开根.setClickable(true);
        btn正负号.setClickable(true);
        btnPoint.setClickable(true);
        btnEqual.setClickable(true);
        btnDelete.setClickable(true);
        btnCE.setClickable(true);
        btnCC.setClickable(true);
        btnMC.setClickable(true);
        btnMR.setClickable(true);
        btnMS.setClickable(true);
        btnMAdd.setClickable(true);
        btnMMinus.setClickable(true);
        btnA.setClickable(true);
        btnB.setClickable(true);
        btnC.setClickable(true);
        btnD.setClickable(true);
        btnE.setClickable(true);
        btnF.setClickable(true);
        spinner01.setClickable(true);
        spinner02.setClickable(true);
    }





    //把十进制转换成二进制，传回去一个String
    public String DtoBT(String num){
        String a = Integer.toBinaryString(Integer.parseInt(num));
        return a ;
    }

    //十转八
    public String DtoOCT(String num){
        String a = Integer.toOctalString(Integer.parseInt(num));
        return a ;
    }
    public String DtoH(String num){
        String a = Integer.toHexString(Integer.parseInt(num));
        a.replace('a','A');
        a.replace('b','B');
        a.replace('c','C');
        a.replace('d','D');
        a.replace('e','E');
        a.replace('f','F');
        return a ;
    }

    // 十六进制转二进制
    public String HToB(String a) {
        String b = Integer.toBinaryString(Integer.valueOf(toD(a, 16)));
        return b;
    }

    //任意进制转换成10进制
    public String toD(String a, int b) {
        int result = 0;
        int r ;
        for (int i = 0; i < a.length(); i++) {
            r = 0;
            r = (int) (r + formatting(a.substring(i, i + 1))
                    * Math.pow(b, a.length() - i -1 ));
            result += r;
        }
        return String.valueOf(result);
    }





    public int formatting(String a) {
        int i = 0;
        for (int u = 0; u < 10; u++) {
            if (a.equals(String.valueOf(u))) {
                i = u;
            }
        }
        if (a.equals("A")) {
            i = 10;
        }
        if (a.equals("B")) {
            i = 11;
        }
        if (a.equals("C")) {
            i = 12;
        }
        if (a.equals("D")) {
            i = 13;
        }
        if (a.equals("E")) {
            i = 14;
        }
        if (a.equals("F")) {
            i = 15;
        }
        return i;
    }


    // 将十进制中的数字转为十六进制对应的字母
    public String formattingH(int a) {
        String i = String.valueOf(a);
        switch (a) {
            case 10: i = "A";
            break;
            case 11: i = "B";
            break;
            case 12: i = "C";
            break;
            case 13: i = "D";
            break;
            case 14: i = "E";
            break;
            case 15: i = "F";
            break;
        }
        return i;
    }
}



