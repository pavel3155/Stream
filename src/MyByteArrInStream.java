import java.io.ByteArrayInputStream;

public class MyByteArrInStream {
    public MyByteArrInStream() {
        byte[] array1 = new byte[]{1, 3, 5, 7, 9, 11};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b=byteStream1.read())!=-1){
            System.out.println(b);
        }

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 6,6);
        int c;
        while((c=byteStream2.read())!=-1){
            System.out.print((char)c);
        }
    }



}
