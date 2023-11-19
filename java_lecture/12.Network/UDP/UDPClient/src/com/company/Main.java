package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            InetAddress address = InetAddress.getLocalHost();       // 서버 주소
            DatagramSocket datagramSocket = new DatagramSocket();   // 소켓 생성

            Scanner scanner = new Scanner(System.in);
            String echoString;

            do{
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();
                byte[] buffer = echoString.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);   //패킷에 내용 + 목적지 정보
                datagramSocket.send(packet);                       // 소켓에서 패킷 전송

                byte[] buffer2 = new byte[50];
                packet = new DatagramPacket(buffer2, buffer2.length);   // 패킷에 버퍼 연결
                datagramSocket.receive(packet);                     // 소켓에서 받아서 버퍼에 넘겨줌
                System.out.println("Text received is: " + new String(buffer2, 0, packet.getLength()));

            } while(!echoString.equals("exit"));
        } catch(SocketTimeoutException e){
            System.out.println("The socket timed out");
        } catch(IOException e){
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
