package com.whatsappwebapi;
import okhttp3.*;

public class WhatsAppSocketClient extends WebSocketListener{
    public void onOpen(WebSocket webSocket,Response response){
        System.out.println("Connection Open! The phone line is Activated.");
    }

    public void onMessage(WebSocket webSocket, okio.ByteString byteString){
        System.out.println("Recived Encrypted Binary Data" + byteString.size());
    }

    public void onMessage(WebSocket webSocket,String text){
        System.out.println("Recived plain text message: " + text);
    }

    public void onClosed(WebSocket webSocket,int code,String reason){
        System.out.println("Connection closed: " + reason);
    }

    public void onFailure(WebSocket webSocket,Throwable t,Response response){
        System.out.println("Error on the socket: " + t.getMessage());
    }

}
