package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost" , 5000)){
            socket.setSoTimeout(5000);      // 서버 문제 -> 일정 시간 반응 없으면 thread 없앰.
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do{
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();
                stringToEcho.println(echoString);           // server에 echoString 전송
                if(!echoString.equals("exit")){
                    response = echoes.readLine();           // server에서 response 받아옴
                    System.out.println(response);
                }
            } while(!echoString.equals("exit"));

        } catch(SocketTimeoutException e){
            System.out.println("The socket timed out");
        } catch(IOException e){
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
