package calc;

import java.util.Scanner;

/**
 * Created by zhoujiongy on 2016/7/28.
 */
public class InputOp {
    private String buffer;

    public void setBuffer(String b){
        this.buffer=b;
    }

    public InputOp(){
        buffer=null;
    }

    public String getBuffer(){
        return this.buffer;
    }

    public void getLine(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            this.buffer=scanner.nextLine();
            if(buffer.equals("quit")) break;
            System.out.println("input: "+this.buffer);

        }
    }
}
