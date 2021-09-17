package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
	try(FileOutputStream binFile = new FileOutputStream("data.dat");
        FileChannel binChannel = binFile.getChannel()){

        byte[] outputBytes = "Hello World!".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
        int numBytes = binChannel.write(buffer);
        System.out.println("numbYtes written was : "+ numBytes);

        ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
        intBuffer.putInt(245);
        intBuffer.flip();
        numBytes = binChannel.write(intBuffer);
        System.out.println("numbYtes written was : "+ numBytes);


        intBuffer.flip();
        intBuffer.putInt(-9875);
        intBuffer.flip();
        numBytes = binChannel.write(intBuffer);
        System.out.println("numbYtes written was : "+ numBytes);


        RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
        FileChannel channel = ra.getChannel();
        outputBytes[0]='a';
        outputBytes[1]='b';
        buffer.flip();
        long numBytesRead = channel.read(buffer);


        System.out.println("outputBytes = "+new String(outputBytes));


        //RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
        //byte[] b = new byte[outputBytes.length];
        //ra.read(b);
        //System.out.println(new String(b));

        //long int1 = ra.readInt();
        //long int2 = ra.readInt();
        //System.out.println(int1);
        //System.out.println(int2);

    }catch (IOException e){
	    e.printStackTrace();
    }
    }
}
