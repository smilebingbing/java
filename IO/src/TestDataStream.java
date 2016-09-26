import java.io.*;
public class TestDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(bao);
        try{
        	dos.writeDouble(Math.random());
        	dos.writeBoolean(true);
        	ByteArrayInputStream bais=new ByteArrayInputStream(bao.toByteArray());
        	System.out.println(bais.available());
        	DataInputStream dis=new DataInputStream(bais);
        	System.out.println(dis.readDouble());
        	System.out.println(dis.readBoolean());
        	dos.close();
        	dis.close();
        }catch(IOException i){
        	i.printStackTrace();
        }
        
	}

}
