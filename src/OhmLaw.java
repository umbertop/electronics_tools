package sample;

import java.lang.Math;

public class OhmLaw{
    public double v, i, r, p;

    public void calc(){
        if(p != 0 && i != 0){
            r = p / Math.pow(i, 2);
            v = p / i;
        }
        else if(v != 0 && p != 0){
            r = Math.pow(v, 2) / p;
            i = p / v;
        }
        else if(v != 0 && i != 0){
            r = v / i;
            p = v * i;
        }
        else if(v != 0 && r != 0){
            i = v / r;
            p = Math.pow(v, 2) / r;
        }
        else if(p != 0 && r != 0){
            i = Math.sqrt(p / r);
            v = Math.sqrt(p * r);
        }
        else if(r != 0 && i != 0){
            p = r * Math.pow(i, 2);
            v = i * r;
        }
        else{
            v = 0;
            i = 0;
            r = 0;
            p = 0;
        }
    }

    @Override
    public String toString(){
        return "v: " + v + ", i: " + i + ", r:" + r + ", p:" + p;
    }
}
