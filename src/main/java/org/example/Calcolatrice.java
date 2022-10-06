package org.example;

public class Calcolatrice {
    private float op1;
    private float op2;

    public Calcolatrice(){

    }

    public float getOp1() {
        return op1;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public float getOp2() {
        return op2;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

    //4 operazioni
    public float addizione(float num1, float num2){
        return num1 + num2;
    }

    public float sottrazione(float num1, float num2){
        return num1 - num2;
    }

    public float moltiplicazione(float num1, float num2){
        return num1 * num2;
    }

    public float divisione(float num1, float num2){
        return num1 / num2;
    }

}
