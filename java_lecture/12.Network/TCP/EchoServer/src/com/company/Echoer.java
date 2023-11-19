package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread{
    private Socket socket;

    public Echoer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output = new PrintWriter(socket.getOutputStream() , true);
            //true : 버퍼가 가득 차면 버퍼 내용을 전송하고 버퍼를 비움.
            //false: 버퍼가 가득 차면 예외발생 후 작업을 중지시키고 에러페이지 출력.
            while(true){
                String echoString = input.readLine();               // 클라이언트에서 input 받아옴
                if(echoString.equals("exit")){
                    break;
                }
                System.out.println(echoString);
//                try{                                              // server timerout 용
//                    Thread.sleep(15000);
//                } catch(InterruptedException e){
//                    System.out.println("Thread interrupted");
//                }
                output.println(echoString);
            }
        } catch(IOException e){
            System.out.println("Oops: " + e.getMessage());
        } finally{
            try{
                socket.close();
            } catch (IOException e){

            }
        }
    }
}
