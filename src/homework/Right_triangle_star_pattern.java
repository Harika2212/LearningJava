package homework;

public class Right_triangle_star_pattern {
    public static void main(String[] args) {
        //✅ Right Triangle Star Pattern
        //*
        //**
        //***
        //****
        //*****

        for(int i=1;i<=5;i++){
            if(i==1){
                System.out.println("*");
            }
            if(i==2) {
                System.out.println("**");
            }
            if(i==3) {
                System.out.println("***");
            }
            if(i==4) {
                System.out.println("****");
            }
            if(i==5) {
                System.out.println("*****");
            }
        }
    }
}
