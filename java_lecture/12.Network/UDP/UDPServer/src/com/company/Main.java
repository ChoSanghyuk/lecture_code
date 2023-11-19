package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) {

        try{
            DatagramSocket socket = new DatagramSocket(5000);

            while(true){
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);  // 패킷과 버퍼 묶음
                socket.receive(packet);                                             // 소켓에서 받은 내용 => 패킷 => 버퍼
                System.out.println("Text received is: " + new String(buffer));      // 버퍼 내용을 String으로

                String returnString = "echo: " + new String(buffer, 0 , packet.getLength());
                byte[] buffer2 = returnString.getBytes();       // response buffer로 저장
                InetAddress address = packet.getAddress();      // Client 주소 받아냄
                int port = packet.getPort();                    // Client 포트번호 받아냄
                packet = new DatagramPacket(buffer2 , buffer2.length, address, port );  // response와 해당 주소와 포트번호 패킷에 묶음
                socket.send(packet);                            // 전송
            }
        } catch(SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch(IOException e ){
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
